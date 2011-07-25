package de.hub.clickwatch.model.provider;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.edit.provider.IItemLabelProvider;

public class TimeStampLabelProvider implements IItemLabelProvider {

	private final static SimpleDateFormat timeFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	private final static NumberFormat nanosFormat = new DecimalFormat("000,000");
	
	@Override
	public String getText(Object object) {
		long time = (Long) object;
		long nanos = time % 1000000;
		Date date = new Timestamp(time / 1000);
		return timeFormat.format(date) + "," + nanosFormat.format(nanos);
	}

	@Override
	public Object getImage(Object object) {
		return null;
	}

}