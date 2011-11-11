package de.hub.clickwatch.recorder.test;

import junit.framework.Assert;

import org.junit.Test;

import de.hub.clickwatch.recorder.database.HBaseRowMap;

public class HBaseRowMapTest {

	@Test
	public void test() {
		HBaseRowMap rowMap = new HBaseRowMap();
		byte[] row = rowMap.createRow("localhost", "e/h", 123456789, true);
		Assert.assertEquals(123456789, rowMap.getTime(row));
	}
}
