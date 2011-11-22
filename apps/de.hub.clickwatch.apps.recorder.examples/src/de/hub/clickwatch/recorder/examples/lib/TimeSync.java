package de.hub.clickwatch.recorder.examples.lib;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVStrategy;

import de.hub.clickwatch.util.Throwables;

public class TimeSync extends HashMap<String, List<Long>> {
	private static final long serialVersionUID = 1L;
	String baseIp = null;
	
	public TimeSync(String fileName) {
		try {
			CSVParser csvParser = new CSVParser(new FileReader(new File(fileName)), new CSVStrategy(' ', '\n', '#'));
			String[][] timeSyncMatrix = csvParser.getAllValues();
						
			for (String[] entry: timeSyncMatrix) {
				String ip = entry[0];
				int key = Integer.parseInt(entry[2]);
				
				String timeStr = entry[1];
				String timeParts[] = timeStr.split("\\.");
				long time = Long.parseLong(timeParts[0])*(long)1e9+Long.parseLong(timeParts[1]);
				time = time / 1000;
				
				if (baseIp == null) {
					baseIp = ip;
				}
				add(ip, key, time);
			}
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}
	
	private void add(String ip, int key, long time) {
		List<Long> times = get(ip);
		if (times == null) {
			times = new ArrayList<Long>();
			put(ip, times);
		}
		while (times.size() < (key + 1)) {
			times.add((long)-1);
		}
		times.set(key, time);
	}
	
	private int getClosestKey(String ip, long targetTime) {
		int i = 0;
		for(Long time: get(ip)) {
			if (time > targetTime) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	private long getTime(String ip, int key) {
		return get(ip).get(key);
	}
	
	public long correctTime(String ip, long measuredTime) {
		int key = getClosestKey(ip, measuredTime);
		long referenceBaseTime = getTime(baseIp, key);
		long referenceLocalTime = getTime(ip, key);
		return measuredTime - (referenceLocalTime - referenceBaseTime);
	}
}