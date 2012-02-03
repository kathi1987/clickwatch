package de.hub.clickwatch.datamodel.util;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampLabelProvider {

	private final static SimpleDateFormat timeFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	private final static NumberFormat nanosFormat = new DecimalFormat("000,000,000");
	
	public String getText(Object object) {
		long time = (Long) object;
		long nanos = time % 1000000000;
		Date date = new Timestamp(time / 1000000);
		return timeFormat.format(date) + "," + nanosFormat.format(nanos);
	}

	public Object getImage(Object object) {
		return null;
	}

}