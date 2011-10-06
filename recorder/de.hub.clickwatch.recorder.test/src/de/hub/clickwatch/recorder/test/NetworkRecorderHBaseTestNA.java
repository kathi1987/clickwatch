package de.hub.clickwatch.recorder.test;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Module;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.cwdatabase.DataBase;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.emfxml.XmlModelRepository;

public class NetworkRecorderHBaseTestNA extends AbstractTest {

	private static final String dataBaseFile = "/Users/markus/Documents/Projects/clickwatch_indigo/02_workspace/de.hub.clickwatch.core.examples.recorder/experiments/hbase_with_record/db.cwdatabase";
	
	@Override
	protected Module[] getAdditionalModules() {
		String record = "../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel";
		return new Module[] {
			new ClickSocketPlayer.PlayerModule(record, false),
			new CWRecorderModule() {

				@Override
				protected void configureDataBaseRecordAdapter() {
					bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
				}

				@Override
				protected void configureDataBaseRetrieveAdapter() {
					bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
				}
				
			}
		};
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}
	
	@Override
	protected int getLogLevel() {
		return 4;
	}
	
	@Override
	protected void additionalSetUp() {
		super.additionalSetUp();
		CWRecorderStandaloneSetup.doSetup();
	}

	@Ignore("only on demand")
	@Test
	public void testWithRecord() throws Exception {		
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
		Resource resource = rs.getResource(URI.createFileURI(dataBaseFile), true);
		DataBase database = (DataBase)resource.getContents().get(0);
		NetworkRecorder recorder = injector.getInstance(NetworkRecorder.class);
		
		recorder.record(database.getRecords().get(0));		
		resource.save(XmlModelRepository.defaultLoadSaveOptions());
		
		System.out.println(database.getRecords().get(0).getStatistics().toString());
	}
}