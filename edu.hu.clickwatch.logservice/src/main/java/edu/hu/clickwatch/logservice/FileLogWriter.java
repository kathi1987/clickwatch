package edu.hu.clickwatch.logservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;

public final class FileLogWriter implements LogListener {
// TODO: Update a log write for all log levels (one file per log level and one overall file)
	private BufferedWriter mWriter = null;
	
	public FileLogWriter(final String pFileName) {
		try {
			this.mWriter = new BufferedWriter(new FileWriter(pFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void logged(LogEntry pEntry) {
		try {
			this.mWriter.write(pEntry.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop(){
		if(this.mWriter != null){
			try {
				this.mWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
