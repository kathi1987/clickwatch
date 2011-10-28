package de.hub.clickwatch.recorder.database.logfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Throwables;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recorder.database.AbstractDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

@Singleton
public class LogFileDataBaseAdapter extends AbstractDataBaseRecordAdapter {
	
	@Inject XmlValueAdapter xmlValueAdapter;
	@Inject IValueAdapter valueAdapter;
	private PrintStream out = null;
	
	@Override
	protected AbstractNodeDataBaseAdapter createNodeDataBaseAdapter() {
		return new AbstractNodeDataBaseAdapter() {
			
		};
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

	@Override
	public void initialize(Record record, boolean overwrite) {
		if (this.out == null) {
			try {
				out = new PrintStream(new File("db_log"));
			} catch (FileNotFoundException e) {
				Throwables.propagate(e);
			}
		}
		super.initialize(record, overwrite);
	}

	@Override
	public boolean record(Object nodeDBAdapter, Handler handler,
			boolean hasChanged, int sample) {	
		printLogEntries(xmlValueAdapter.create(handler, valueAdapter));
		return super.record(nodeDBAdapter, handler, hasChanged, sample);
	}

	private void printLogEntries(Handler xmlHandler) {
		List<AnyType> leafs = new ArrayList<AnyType>();
		String text = "";
		for (FeatureMap.Entry fme: xmlHandler.getMixed()) {
			text = fme.getValue().toString().trim().replace("\n", " ");
		}
		for (FeatureMap.Entry fme: xmlHandler.getAny()) {
			if (fme.getValue() instanceof AnyType) {
				getLeafs((AnyType)fme.getValue(), leafs);
			}
		}
		
		String logEntry = null;
		if (leafs.size() == 0) {
			logEntry = DateFormat.getDateTimeInstance().format(new Date(xmlHandler.getTimestamp()/1000000)) + " "					
					+ xmlHandler.getQualifiedName() + " "
					+ text;
		}
		for (AnyType leaf: leafs) {
			logEntry = DateFormat.getDateTimeInstance().format(new Date(xmlHandler.getTimestamp()/1000000)) + " "				
					+ xmlHandler.getQualifiedName() + " "
					+ text + " "
					+ getLogEntry(leaf);
		}
				
		synchronized (this) {
			out.println(logEntry);
		}
	}

	private String getLogEntry(AnyType leaf) {
		StringBuffer result = new StringBuffer();
		for(FeatureMap.Entry fme: leaf.getAnyAttribute()) {
			result.append(fme.getEStructuralFeature().getName() + "=" + fme.getValue().toString().trim().replace("\n", " ") + " ");
		}
		for(FeatureMap.Entry fme: leaf.getMixed()) {
			if (fme.getEStructuralFeature().getName().equals("text")) {
				result.append(fme.getValue().toString().trim().replace("\n", " ") + " ");
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
