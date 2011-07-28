package de.hub.clickwatch.recorder.database;


public class DummyDataBaseAdapter extends AbstractDataBaseRecordAdapter {

	@Override
	protected AbstractNodeDataBaseAdapter createNodeDataBaseAdapter() {
		return new AbstractNodeDataBaseAdapter() {
			
		};
	}

}
