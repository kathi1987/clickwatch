package edu.hu.clickwatch.logservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogService;

public final class FileLogWriter implements LogListener {
	
	private HashMap<Integer, BufferedWriter> logFileList;
	
	
	public void open(final String pDirectory) {
		logFileList = new HashMap<Integer, BufferedWriter>();
		// TODO: Fixme. This should be cancelled after the first failed creation of a buffered writer
		createBufferedWriter(LogService.LOG_DEBUG, pDirectory);
		createBufferedWriter(LogService.LOG_ERROR, pDirectory);
		createBufferedWriter(LogService.LOG_INFO, pDirectory);
		createBufferedWriter(LogService.LOG_WARNING, pDirectory);
	}

	public void logged(LogEntry pEntry) {
		try {
			switch (pEntry.getLevel()) {
				case LogService.LOG_WARNING:
					logFileList.get(LogService.LOG_DEBUG).write(pEntry.getMessage());
					break;
					
				case LogService.LOG_ERROR:
					logFileList.get(LogService.LOG_ERROR).write(pEntry.getMessage());
					break;
			
				case LogService.LOG_INFO:
					logFileList.get(LogService.LOG_INFO).write(pEntry.getMessage());
					break;
					
				default:
					logFileList.get(LogService.LOG_WARNING).write(pEntry.getMessage());
					break;
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop(){
		for(BufferedWriter writer : this.logFileList.values()){
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void createBufferedWriter(Integer pType, String pDirectory){
		String type;
		switch (pType) {
		case LogService.LOG_WARNING:
			type = "warning";
			break;
			
		case LogService.LOG_ERROR:
			type = "error";
			break;
	
		case LogService.LOG_INFO:
			type = "info";
			break;
			
		default:
			type = "debug";
			break;
		}
		
		try {
			// TODO: Fixme. This will only work on linux/unix machines. Should be fixed!
			BufferedWriter writer = new BufferedWriter(new FileWriter(pDirectory + "/" + type + ".log"));
			this.logFileList.put(pType, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
