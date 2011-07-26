package de.hub.clickwatch.recorder.database;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.ExperimentRecorder;
import de.hub.clickwatch.recorder.NodeRecorder;

public interface IDataBaseRecordAdapter {

	/**
	 * Is called by the {@link ExperimentRecorder} to initialize the data-base.
	 */
	public void initialize(ExperimentDescr experiment, boolean overwrite);

	/**
	 * Is called by each {@link NodeRecorder} before starting the actual
	 * recording, to allow initialization for specific nodes.
	 */
	public Object addNode(Node metaData);

	/**
	 * Is called by {@link NodeRecorder}s. Beware of concurrent calls.
	 * 
	 * @param hasChanged
	 *            , tells the adapter whether the handler has changes since last
	 *            pull.
	 * @return true, iff the record was stored (for statistics).
	 */
	public boolean record(Object nodeAdapter, Handler handler, boolean hasChanged, int sample);
	
	/**
	 * Is called by {@link NodeRecorder} when recording of a single node is over.
	 */
	public void close(Object nodeAdapter);

	/**
	 * Is called by the {@link ExperimentRecorder} when everything is over.
	 */
	public void close();

}
