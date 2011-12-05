package de.hub.clickwatch.apps.examples.bm;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class LogFileBenchmarkAdapter implements IBenchmarkAdapter {

	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(ClickWatchRecorderModule.I_PUTS_BUFFER_SIZE) int putsBufferSize;
	@Inject ILogger logger;
	private File file;
	private PrintWriter out;
	private int sample = 0;
	
	
	@Override
	public void open() {
		file = new File("clickwatch_bm.log");
		try {
			out = new PrintWriter(file);			
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		sample = 0;
	}

	@Override
	public void writeSample(Node node, Handler handler, Handler xmlHandler) {
		if (xmlHandler != null) {
			printLogEntries(xmlHandler, handler.getTimestamp(), node.getINetAddress());
		} else {
			out.print("### " + handler.getTimestamp() + " " + node.getINetAddress() + " " + handler.getQualifiedName() + " " + valueAdapter.getPlainValue(handler) + "\n");
		}
		sample++;
		if (sample % putsBufferSize == 0) {
			flush();
		}
	}

	@Override
	public void readSample(Node node, Handler handler, long timestamp) {

	}

	@Override
	public void scanSample(Node node, Handler handler, long start, long end) {
		try {
			Pattern pattern = Pattern.compile("### ([0-9]+) ([0-9\\.]+) ([a-zA-Z0-9/_]+) .*");
			DataInputStream in = new DataInputStream(new FileInputStream(file));			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
	
			String strLine;
		
			while ((strLine = br.readLine()) != null) {
				if (strLine.startsWith("###")) {					
					Matcher matcher = pattern.matcher(strLine);
					if (!matcher.matches()) {
						throw new Exception();
					}
					long time = Long.parseLong(matcher.group(1));
					if (time >= start && time <= end && matcher.group(2).equals(node.getINetAddress()) && matcher.group(3).equals(handler.getQualifiedName())) {
						//logger.log(ILogger.DEBUG, "found log entry", null);
					}
				}		
			}
			br.close();
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}
	
	

	@Override
	public void flush() {
		out.flush();
	}

	@Override
	public void close() {
		flush();
		out.close();
		file.delete();
	}

	private void printLogEntries(Handler xmlHandler, long timestamp, String nodeId) {
		List<AnyType> leafs = new ArrayList<AnyType>();
		String text = "";
		for (FeatureMap.Entry fme: xmlHandler.getMixed()) {
			text = fme.getValue().toString().replace("\n", " ").trim();
		}
		for (FeatureMap.Entry fme: xmlHandler.getAny()) {
			if (fme.getValue() instanceof AnyType) {
				getLeafs((AnyType)fme.getValue(), leafs);
			}
		}
		
		String qualifiedName = xmlHandler.getQualifiedName();
		if (leafs.size() == 0) {
			String logEntry = "### " + timestamp + " " + nodeId + " "					
					+ qualifiedName + " "
					+ text.trim();
			out.println(logEntry);
		}
		for (AnyType leaf: leafs) {
			String logEntry = "### " + timestamp + " "	+ nodeId + " "
					+ qualifiedName + " "
					+ text + (text.equals("")?"":" ")
					+ getLogEntry(leaf).trim();
			out.println(logEntry);
		}
	}

	private String getLogEntry(AnyType leaf) {
		StringBuffer result = new StringBuffer();
		for(FeatureMap.Entry fme: leaf.getAnyAttribute()) {
			result.append(fme.getEStructuralFeature().getName() + "=" + fme.getValue().toString().replace("\n", " ").trim() + " ");
		}
		for(FeatureMap.Entry fme: leaf.getMixed()) {
			if (fme.getEStructuralFeature().getName().equals("text")) {
				String text = fme.getValue().toString().replace("\n", " ").trim();
				result.append(text);
				if (!text.equals("")) {
					result.append(" ");
				}
			}
		}
		if (leaf.eContainer() instanceof AnyType) {
			return getLogEntry((AnyType)leaf.eContainer()) + result.toString();
		} else {
			return result.toString();
		}
	}

	private void getLeafs(AnyType any, List<AnyType> result) {
		boolean hasChild = false;
		for (FeatureMap.Entry fme: any.getAny()) {
			Object child = fme.getValue();
			if (child instanceof AnyType) {
				hasChild = true;
				getLeafs((AnyType)child, result);
			}
		}
		if (!hasChild) {
			result.add(any);
		}
	}
	
}
