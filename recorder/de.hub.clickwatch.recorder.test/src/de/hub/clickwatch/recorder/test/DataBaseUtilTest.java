package de.hub.clickwatch.recorder.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.AbstractModule;
import com.google.inject.Module;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.recorder.database.DataBaseUtil;

public class DataBaseUtilTest extends AbstractDBTest {

	@Override
	protected Module[] getAdditionalModules() {
		String record = "../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel";
		AbstractModule module = new ClickSocketPlayer.PlayerModule(record,
				false);
		List<Module> result = new ArrayList<Module>();
		result.addAll(Arrays.asList(super.getAdditionalModules()));
		result.add(module);
		return result.toArray(new Module[] {});
	}

	@Override
	protected Class<? extends IValueAdapter> getDBValueAdapterClass() {
		return XmlValueAdapter.class;
	}

	@Override
	protected int getLogLevel() {
		return 4;
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XmlValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Override
	protected void adapterTestSetUp() {
		// empty
		// this disables the adapterTest setup part. Actually you don't this
		// test to be an adapter test, but since multiple inheritance is not
		// supported, we use this trick.
	}

	@Ignore("work in progress")
	@Test
	public void testWithRecord() throws Exception {
		ExperimentDescr exprDescr = performTest(new String[] { "localhost",
			 "seismo171.testbed",
			 "seismo161.testbed", "seismo191.testbed", "seismo160.testbed",
			 "seismo185.testbed", "seismo196.testbed", "seismo172.testbed"
		});

		 DataBaseUtil util = injector.getInstance(DataBaseUtil.class);
		
		 long duration = exprDescr.getEnd() - exprDescr.getStart();
		 int runs = 20;
		 for (int i = 0; i < runs; i++) {
			 long time = exprDescr.getStart() + (i* (duration/runs));
			 System.out.println("run: " + i);
			 util.getNode(exprDescr,
			 exprDescr.getNetwork().getNodes().get(0).getINetAddress(), time);
		 }

	}

	@Override
	protected Collection<String> handlerNamesOfNode(Node node) {
		return Lists.transform(node.getAllHandlers(),
				new Function<Handler, String>() {
					public String apply(Handler from) {
						return from.getQualifiedName();
					}
				});
	}

	protected void assertValue(Handler handler) {
		Assert.assertTrue(true);
	}

	@Override
	protected int getExperimentDuration() {
		return 30000;
	}
}