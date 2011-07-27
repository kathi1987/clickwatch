package de.hub.clickwatch.examples.recorder.pdrplot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.inject.Module;

import de.hub.clickwatch.AbstractMain;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.util.ILogger;
import de.hub.emfxml.XmlModelRepository;

public class Main extends AbstractMain {
	
	@Override
	protected Module[] getAdditionalModules() {
		return new Module[] { new CWRecorderModule() };
	}
	
	@Override
	protected int getLogLevel() {
		return 4;
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XmlValueAdapter.class;
	}

	public void run(String experimentFile) throws Exception {
		setUp();
		CWRecorderStandaloneSetup.doSetup();
		injector.getInstance(ILogger.class).log(ILogger.INFO, "Start analysis on database: " + experimentFile, null);
		PdrPlotAnalysis analysis = injector.getInstance(PdrPlotAnalysis.class);
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
		Resource resource = rs.getResource(URI.createFileURI(experimentFile), true);
		DataBase database = (DataBase)resource.getContents().get(0);
		
		analysis.perform(database.getExperiments().get(0));
		
	}
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.run("/Users/markus/Documents/Projects/clickwatch_indigo/04_results/compoundone/compound_exp_one.cwdatabase");
	}
}
