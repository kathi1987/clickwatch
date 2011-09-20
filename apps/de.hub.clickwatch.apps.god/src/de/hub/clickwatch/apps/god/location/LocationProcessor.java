package de.hub.clickwatch.apps.god.location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.information.APInformations;
import de.hub.clickwatch.apps.god.information.StatsInformation;
import de.hub.clickwatch.apps.god.information.MacIpInformation;
import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.GpsInformation;
import de.hub.clickwatch.apps.god.information.StorageManager;
import de.hub.clickwatch.apps.god.node.GpsProcessor;
import de.hub.clickwatch.apps.god.node.MacIpProcessor;
import de.hub.clickwatch.apps.god.node.StatsProcessor;

public class LocationProcessor extends Thread {
	private ConcurrentHashMap<String, TrainingData> apTrainingData = new ConcurrentHashMap<String, TrainingData>();
	private int rssi_columns = -1;
	private int rssi_rows = -1;
	private StorageManager storageMgr;
	private double alphaVal = 9;
	private boolean activeComputation = true;
	private boolean takeHalfTrainingData = false;
	private HashMap<String, TrainingData> otherHalfTrainingData = new HashMap<String, TrainingData>();
	
	public LocationProcessor(StorageManager storageMgr) {
		this.storageMgr = storageMgr;
	}
	
	public double getAlphaVal() {
		return alphaVal;
	}

	public void setAlphaVal(double alphaVal) {
		this.alphaVal = alphaVal;
	}

	public boolean isTakeHalfTrainingData() {
		return takeHalfTrainingData;
	}

	public void setTakeHalfTrainingData(boolean takeHalfTrainingData) {
		this.takeHalfTrainingData = takeHalfTrainingData;
	}

	public HashMap<String, TrainingData> getOtherHalfTrainingData() {
		return otherHalfTrainingData;
	}

	public boolean isActiveComputation() {
		return activeComputation;
	}

	public void setActiveComputation(boolean activeComputation) {
		this.activeComputation = activeComputation;
	}

	public boolean setup() {
		//load CSV-files
		for (String knownAp : Server.getSzenario().get_TRAINING_GPS_RSSI_DATA()) {
			try {
				TrainingData trDat = new TrainingData(knownAp);
				trDat.setLatitude(loadFromFile(knownAp, "latitude", 0));
				trDat.setLongitude(loadFromFile(knownAp, "longitude", 0));
				
				double[][] rssi_values = loadFromFile(knownAp, "rssi", 0);
				
				if ((rssi_columns == -1) && (rssi_rows == -1)) {
					rssi_rows = rssi_values.length;
					rssi_columns = rssi_values[0].length;
				} else if ((rssi_rows != rssi_values.length) || (rssi_columns != rssi_values[0].length)) {
					System.err.println("Rssi Value Matrix dim(" + rssi_values.length + "," + rssi_values[0].length + 
						") has different dimensions, than expected dim(" + rssi_rows + "," + rssi_columns + 
						") ... stopping trainng data setup");
					return false;
				}
				
				trDat.setRssi(rssi_values);
				apTrainingData.put(knownAp, trDat);
				
				if (takeHalfTrainingData) {
					TrainingData otherHalf = new TrainingData(knownAp);
					otherHalf.setLatitude(loadFromFile(knownAp, "latitude", 1));
					otherHalf.setLongitude(loadFromFile(knownAp, "longitude", 1));
					otherHalf.setRssi(loadFromFile(knownAp, "rssi", 1));
					otherHalfTrainingData.put(knownAp, otherHalf);
				}
				
			} catch (Exception exc) {
				return false;
			}
		}
		
		return true;
	}
	
	public void startComputation() {
		if (!this.activeComputation) {
			computePositions();
		}
	}
	
	private void computePositions() {
		List<ClientInformations> clientInfos = new ArrayList<ClientInformations>();
		
		for (String client : storageMgr.getClientMacs()) {
			HashMap<String, ClientInformations> infos = storageMgr.getClientInformations(client);
			if ((infos.containsKey(StatsProcessor.class.getName())) && //was seen
				(((StatsInformation)infos.get(StatsProcessor.class.getName())).getApList().size() > 1)) {	//from at least one ap
				
				//if it is an AP: ignore!
				if ((infos.containsKey(MacIpProcessor.class.getName())) &&
					(((MacIpInformation)infos.get(MacIpProcessor.class.getName())).isAP())) {
					continue;
				}
				
				HashMap<String, APInformations> apInfos = ((StatsInformation)infos.get(StatsProcessor.class.getName())).getApList();
				
				//check, how often the client was seen in the last 20 sec
				int last_seen_count = 0;
				for (String ap : apInfos.keySet()) {
					if ((System.currentTimeMillis() - apInfos.get(ap).getTime()) <= (20*1000)) {
						last_seen_count++;
					}
				}
				
				//if the data is not too old, or there was not gps coordinate computed
				if ((last_seen_count > 1) || 
					(!infos.containsKey(GpsProcessor.class.getName())) ) {

					GpsInformation newGps = new GpsInformation();
					newGps.setGuessed(true);
					newGps.setClientMac(client);
					newGps.setAlt(0);
					newGps.setSpeed(0);
					newGps.setTime(System.currentTimeMillis());
					
					//compute lat/long/acc
					int rmsStar = 99999999;
					int rowStar = -1;
					int colStar = -1;
					int computedByApNumStar = -1;
					
					for (int row = 0; row < rssi_rows; row++) {
						for (int col = 0; col < rssi_columns; col++) {
							int rms_here = 0;
							int computedByApNum = 0;
							
							//compute rms for this position (high values are bad -> client is not here)
							for (String ap: apInfos.keySet()) {
								
								//if there are apTrainingData for this ap
								if (apTrainingData.containsKey(ap)) {
									computedByApNum++;
									
									double rms_here_ap = Math.abs(
												apTrainingData.get(ap).getRssi()[row][col]
												- apInfos.get(ap).getRssi()
										);
									//add ("difference training<-->measured value") * ("alpha(training)")
									//where "alpha" is dependent on the training value
									rms_here += rms_here_ap * alpha(apTrainingData.get(ap).getRssi()[row][col]);
								} else {
									//if measured values containing an AP, that is not in apTrainingData
									rms_here += apInfos.get(ap).getRssi() * alpha(apInfos.get(ap).getRssi());
								}
							}
							
							//increase the rms, when the client is not seen by an AP on this position, but should be
							for (String knownAp : apTrainingData.keySet()) {
								if ((apTrainingData.get(knownAp).getRssi()[row][col] > 0.9) && //ap should be seen
									(!apInfos.keySet().contains(knownAp))) {	//is not seen
									rms_here += apTrainingData.get(knownAp).getRssi()[row][col] * alpha(apTrainingData.get(knownAp).getRssi()[row][col]);
								}
							}

							//find out, if it is a new rmsStar ;)
							if ((rms_here < rmsStar) && (computedByApNum > 0)) {
								rmsStar = rms_here;
								rowStar = row;
								colStar = col;
								computedByApNumStar = computedByApNum;
							}
						}
					}
					
					
					if (rowStar >= 0) {
						TrainingData lat_lon = apTrainingData.get(apTrainingData.keys().nextElement());
						
						newGps.setLat(lat_lon.getLatitude()[rowStar][colStar]);
						newGps.setLon(lat_lon.getLongitude()[rowStar][colStar]);
						newGps.setComputedByApNum(computedByApNumStar);
						newGps.setAccuracy(rmsStar);
						newGps.setOptionalFoundCol(colStar);
						newGps.setOptionalFoundRow(rowStar);
						
						clientInfos.add(newGps);
					}
				} else {
					continue;
				}
			}
		}
		
		if (clientInfos.size() > 0) {
			System.out.println("\tguessed " + clientInfos.size() + " client gps positions");
		}

		//store into StorageManager
		storageMgr.store(GpsProcessor.class.getName(), clientInfos);
	}
	
	private double alpha(double val) {
		return val + alphaVal;
	}
	
	private double[][] loadFromFile(String apMac, String type, int odd_or_even) throws Exception {
		File file = new File(Server.getSzenario().get_TRAINING_GPS_RSSI_DATA_FOLDER() + apMac + Server.getSzenario().get_DATA_MAP_ENDING().get(type));
		int row = 0;
		int col = 0;
		
		try {
			BufferedReader bufRdr  = new BufferedReader(new FileReader(file));
			String l;
			while ((l = bufRdr.readLine()) != null) {
				row++;
				StringTokenizer st = new StringTokenizer(l,",");
				col = st.countTokens();
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("cannot find file " + file.getAbsolutePath() + " ... end setting up training_data");
			throw e;
		}
		
		double[][] doubleMatrix = new double[row][col];
		try {
			
			BufferedReader bufRdr = new BufferedReader(new FileReader(file));
			String line = null;
			row = 0;
			while ((line = bufRdr.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,",");
				col = 0;
				
				while (st.hasMoreTokens()) {
					//get next token and store it in the array
					if (takeHalfTrainingData) {
						//chess board method: row/col --> both odd, or both even
						if ((row+col) % 2 == odd_or_even) {
							doubleMatrix[row][col++] = new Double(st.nextToken());
						} else {
							st.nextToken();	//throw away
							doubleMatrix[row][col++] = new Double(0);
						}
					} else {
						doubleMatrix[row][col++] = new Double(st.nextToken());
					}
				}
				
				row++;
			}
			
			//close the file
			bufRdr.close();
			
		} catch (NumberFormatException e) {
			System.err.println("cannot convert a number in file " + file.getAbsolutePath() + " ... end setting up training data");
			throw e;
		} catch (IOException e) {
			System.err.println("Error while reading the file " + file.getAbsolutePath() + " ... end setting up training data");
			throw e;
		}
		
		return doubleMatrix;
	}
	
	public void run() {
		System.out.println("starting LocationProcessor with " + apTrainingData.size() + " known APs");
		
		while (true) {
			try {
				if (this.activeComputation) {
					computePositions();
				}
				try {
					sleep(Server.getSzenario().get_COMPUTE_POSITION_TIMER());
				} catch (InterruptedException int_exc) {
					System.err.println("");
				}
			} catch (Exception exc) {
				System.err.println("Error while computePositions: " + exc.getMessage());
				
				try { sleep(Server.getSzenario().get_WAIT_AFTER_COMPUTE_POSITION_ERROR()); } catch (InterruptedException int_exc) {/*nothing to do*/}
			}
		}
	}
}
