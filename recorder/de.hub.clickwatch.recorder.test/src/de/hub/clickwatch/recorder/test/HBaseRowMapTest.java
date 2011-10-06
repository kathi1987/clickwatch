package de.hub.clickwatch.recorder.test;

import junit.framework.Assert;

import org.junit.Test;

import de.hub.clickwatch.model.util.builder.ElementBuilder;
import de.hub.clickwatch.model.util.builder.HandlerBuilder;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap;

public class HBaseRowMapTest {

	@Test
	public void test() {
		HBaseRowMap rowMap = new HBaseRowMap();
		rowMap.addNode(NodeBuilder.newNodeBuilder()
				.withINetAddress("localhost")
				.withElements(ElementBuilder.newElementBuilder()
						.withName("e")
						.withHandlers(HandlerBuilder.newHandlerBuilder()
								.withName("h"))).build());
		byte[] row = rowMap.createRow("localhost", "e/h", 123456789);
		Assert.assertEquals(123456789, rowMap.getTime(row));
	}
}
