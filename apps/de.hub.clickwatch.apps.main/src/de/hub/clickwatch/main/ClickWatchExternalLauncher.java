package de.hub.clickwatch.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;


public class ClickWatchExternalLauncher {
	
	private final Class<? extends IClickWatchMain> mainClass;
	private final Class<? extends IClickWatchContextAdapter>[] adapterClasses;
	private Map<Class<?>, IClickWatchContextAdapter> adapters = new HashMap<Class<?>, IClickWatchContextAdapter>();
	private CommandLine commandLine;
	private Options commandLineOptions;
	
	private ClickWatchExternalLauncher(Class<? extends IClickWatchMain> mainClass, Class<? extends IClickWatchContextAdapter>[] adapterClasses) {
		this.mainClass = mainClass;
		this.adapterClasses = adapterClasses;
	}
	
	private IClickWatchContext createContext() {		
		return new IClickWatchContext() {			
			@SuppressWarnings("unchecked")
			@Override
			public <T> T getAdapter(Class<T> adapterClass) {
				Object adapter = adapters.get(adapterClass);
				if (adapter != null) {
					return (T)adapter;
				} else {
					return null;
				}
			}
		};
	}
	
	private boolean initalize(String[] args) {
		Injector adapterInjector = Guice.createInjector();
		for (Class<? extends IClickWatchContextAdapter> adapterClass: adapterClasses) {
			adapters.put(adapterClass, adapterInjector.getInstance(adapterClass));
		}
		
		commandLineOptions = new Options();
		for(IClickWatchContextAdapter adapter: adapters.values()) {
			for(Option option: adapter.getCommandLineOptions())
			commandLineOptions.addOption(option);
		}
		try {
			commandLine = new PosixParser().parse(commandLineOptions, args);
			for(IClickWatchContextAdapter adapter: adapters.values()) {
				adapter.initialize(commandLine);
			}
		} catch (ParseException e) {
			new HelpFormatter().printHelp(e.getLocalizedMessage(), commandLineOptions);
			return false;
		}
		return true;
	}

	private void doLaunch() {
		IClickWatchContext ctx = createContext();
		IClickWatchMain main = ctx.getAdapter(IInjectorProvider.class).getInjector().getInstance(mainClass);
		main.main(ctx);
	}
	
	public static void launch(String[] args, Class<? extends IClickWatchMain> mainClass, Class<? extends IClickWatchContextAdapter>[] adapterClasses) {		
		standaloneSetUp();
		ClickWatchExternalLauncher launcher = new ClickWatchExternalLauncher(mainClass, adapterClasses);
		if (launcher.initalize(args)) {
			launcher.doLaunch();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void launch(String[] args, Class<? extends IClickWatchMain> mainClass) {
		List<Class<?>> adapterClasses = new ArrayList<Class<?>>();
		adapterClasses.add(IInjectorProvider.class);
		adapterClasses.add(IExperimentProvider.class);
		adapterClasses.add(IArgumentsProvider.class);
		adapterClasses.add(IResultsProvider.class);
		launch(args, mainClass, adapterClasses.toArray(new Class[]{}));
	}

	public static void standaloneSetUp() {
		ClickWatchStandaloneSetup.doSetup();
		CWRecorderStandaloneSetup.doSetup();
	}
}
