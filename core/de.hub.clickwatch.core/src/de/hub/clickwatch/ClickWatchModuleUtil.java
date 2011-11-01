package de.hub.clickwatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.eclipse.emf.common.util.URI;

import com.google.common.base.Preconditions;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.internal.CompoundHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.internal.HandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.merge.ClickWatchNodeMergeConfiguration;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ClickWatchModuleUtil {

	public enum HandlerBehaviour {
		DEFAULT, COMPOUND, COMPOUND_RECORDING, COMPOUND_RECORDING_DIFFERENCES
	};
	
	public static ClickWatchModuleBuilder newBuilder() {
		return new ClickWatchModuleBuilder();
	}
	
	public static class ClickWatchModuleBuilder {		
		
		private ClickWatchModuleBuilder() {
			// empty
		}
		
		private int debugLevel = 2; // 1,2,3,4
		private String logFile = null;
		private PrintStream logOut = System.out;
		
		private String[] ignoredHandlerNames = new String[] { "debug", "handlers", "ports", "name", "links" }; // config, class
		private HandlerBehaviour handlerBehaviour = HandlerBehaviour.DEFAULT;
		private int remoteUpdatePeriod = 1000;
		private int compoundHanlderLocalUpdateDelay = 1000;
		
		private Class<? extends IValueAdapter> valueAdapterClass = StringValueAdapter.class;

		private URI recordURI = null;
		private Class<? extends IClickSocket> clickSocketClass = ClickSocketImpl.class;
		private IClickSocket clickSocketImpl = null;
		
		private int connectionThreads = 5;
		private int eventHandlerThreads = 5;
		
        private IMergeConfiguration mergeConfiguration = new ClickWatchNodeMergeConfiguration();
		
		public ClickWatchModuleBuilder wDebugLvl(int debugLevel) {
			wDebug(debugLevel, System.out);
			return this;
		}
		
		public ClickWatchModuleBuilder wDebug(int debugLevel, String logFile) {
			Preconditions.checkArgument(debugLevel > 0 && debugLevel <= 4);
			this.logFile = logFile;
			this.debugLevel = debugLevel;
			return this;
		}
		
		public ClickWatchModuleBuilder wDebug(int debugLevel, PrintStream logOut) {
			Preconditions.checkArgument(debugLevel > 0 && debugLevel <= 4);
			this.logOut = logOut;
			this.debugLevel = debugLevel;
			return this;
		}

		public ClickWatchModuleBuilder wHandlerBhvr(HandlerBehaviour handlerBehaviour, 
				int localUpdateDelay, 
				int remoteUpdatePeriod) {
			this.handlerBehaviour = handlerBehaviour;
			this.remoteUpdatePeriod = remoteUpdatePeriod;
			this.compoundHanlderLocalUpdateDelay = localUpdateDelay;
			return this;
		}
		
		public ClickWatchModuleBuilder wValueAdapterClass(Class<? extends IValueAdapter> valueAdapterClass) {
			this.valueAdapterClass = valueAdapterClass;
			return this;
		}
		
		public ClickWatchModuleBuilder wClickSocketClass(Class<? extends IClickSocket> clickSocketClass) {
			this.clickSocketClass  = clickSocketClass;
			return this;
		}
		
		public ClickWatchModuleBuilder wClickSocketImpl(IClickSocket clickSocketImpl) {
			this.clickSocketImpl  = clickSocketImpl;
			return this;
		}
		
		public ClickWatchModuleBuilder wRecord(URI recordURI) {
			this.recordURI = recordURI;
			return this;
		}
		
		public ClickWatchModuleBuilder wIgnoredHandlers(String ... handlerNames) {
			this.ignoredHandlerNames = handlerNames;
			return this;
		}
		
		public ClickWatchModuleBuilder wThreads(int connectionThreads, int eventHandlerThreads) {
			this.connectionThreads = connectionThreads;
			this.eventHandlerThreads = eventHandlerThreads;
			return this;
		}
		

        public ClickWatchModuleBuilder wMergeConfiguration(IMergeConfiguration mergeConfiguration) {
            this.mergeConfiguration  = mergeConfiguration;
            return this;
        }
		
		public ClickWatchModule build() {
			return new ClickWatchModule() {			    
				@Override
				protected ILogger createLogger() {
					return new ILogger() {
						@Override
						public synchronized void log(int status, String message,
								Throwable exception) {
							if (logFile != null) {
								try {
									logOut = new PrintStream(new File(logFile));
								} catch (FileNotFoundException e) {
									Throwables.propagate(e);
								}
							}
							if ((debugLevel) >= status) {
								logOut.print(DateFormat.getDateTimeInstance()
										.format(new Date()) + " ");

								if (status == ILogger.DEBUG) {
									logOut.print("[DEBUG] ");
								} else if (status == ILogger.INFO) {
									logOut.print("[INFO] ");
								} else if (status == ILogger.WARNING) {
									logOut.print("[WARNING] ");
								} else if (status == ILogger.ERROR) {
									logOut.print("[ERROR] ");
								}

								logOut.print(message);
								if (exception != null) {
									logOut.println(": "
											+ exception.getMessage());
									exception.printStackTrace(logOut);
								}
								logOut.println("");
								logOut.flush();
							}
						}
					};
				}

				@Override
				protected void bindHandlerEventAdapter() {
					if (ignoredHandlerNames == null) {
						ignoredHandlerNames = new String[] {};
					}
					bind(Collection.class).annotatedWith(Names.named(CS_IGNORED_HANDLER_NAMES)).toInstance(
							new HashSet<String>(Arrays.asList(ignoredHandlerNames)));
					if (handlerBehaviour.ordinal() >= HandlerBehaviour.COMPOUND
							.ordinal()) {
						bind(IHandlerEventAdapter.class).to(
								CompoundHandlerEventAdapter.class);
					} else {
						bind(IHandlerEventAdapter.class)
								.to(HandlerEventAdapter.class);
					}
					bind(int.class).annotatedWith(Names.named(I_REMOTE_UPDATE_PERIOD)).toInstance(remoteUpdatePeriod);
					if (handlerBehaviour.ordinal() >= HandlerBehaviour.COMPOUND_RECORDING
							.ordinal()) {
						bind(Boolean.class)
								.annotatedWith(
										Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS))
								.toInstance(true);
					} else {
						bind(Boolean.class)
								.annotatedWith(
										Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS))
								.toInstance(false);
					}
					if (handlerBehaviour == HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES) {
						bind(Boolean.class)
								.annotatedWith(
										Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY))
								.toInstance(true);
					} else {
						bind(Boolean.class)
								.annotatedWith(
										Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY))
								.toInstance(false);
					}

					bind(Integer.class)
							.annotatedWith(
									Names.named(ClickWatchModule.I_COMPOUND_HANDLER_LOCAL_UPDATE_DELAY))
							.toInstance(compoundHanlderLocalUpdateDelay);
					bind(Boolean.class)
							.annotatedWith(
									Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION))
							.toInstance(false);
				}

				@Override
				protected void bindValueAdapter() {
					Preconditions.checkState(valueAdapterClass != null);
					bind(IValueAdapter.class).to(valueAdapterClass);					
				}

				@Override
				protected void bindClickSocket() {
					if (recordURI != null) {
						bindToPlayer();
					} else if (clickSocketImpl != null) {
						bind(IClickSocket.class).toInstance(clickSocketImpl);
					} else {
						bind(IClickSocket.class).to(clickSocketClass);
					}
				}

				private ClickSocketPlayer player = null;

				private void bindToPlayer() {
					if (player == null) {
						player = new ClickSocketPlayer();
						player.initialize(recordURI);
					}

					bind(ClickSocketPlayer.class).toInstance(player);
					bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
				}
				
				@Override
				protected void bindExecutorServices() {
					bind(ScheduledExecutorService.class).toInstance(Executors.newScheduledThreadPool(connectionThreads));
					bind(ExecutorService.class).toInstance(Executors.newFixedThreadPool(eventHandlerThreads));
				}

                @Override
                protected void bindMergeConfiguration() {
                    bind(IMergeConfiguration.class).toInstance(mergeConfiguration);
                }
			};
		}
	}
}
