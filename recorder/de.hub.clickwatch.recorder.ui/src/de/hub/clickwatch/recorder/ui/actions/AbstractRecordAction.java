package de.hub.clickwatch.recorder.ui.actions;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.recorder.Recorder;
import de.hub.clickwatch.ui.modelactions.AbstractAction;

public abstract class AbstractRecordAction extends AbstractAction<Record> {
	

    @Inject private Provider<Recorder> recorderProvider;
    
    private class RecordAdapter extends AdapterImpl {
        private final Recorder recorder;

        public RecordAdapter(Recorder recorder) {
            super();
            this.recorder = recorder;
        }
    }
    
    protected Recorder getRecorder(Record record) {
        for (Adapter adapter: record.eAdapters()) {
            if (adapter instanceof RecordAdapter) {
                return ((RecordAdapter)adapter).recorder;
            }
        }
        record.eAdapters().add(new RecordAdapter(recorderProvider.get()));
        return getRecorder(record);
    }
}
