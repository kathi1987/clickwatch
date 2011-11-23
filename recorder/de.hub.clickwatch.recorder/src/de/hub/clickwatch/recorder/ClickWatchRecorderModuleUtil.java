package de.hub.clickwatch.recorder;

import com.google.inject.name.Names;

import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;

public class ClickWatchRecorderModuleUtil {

    public static final class ClickWatchRecordModuleBuilder {        
        private Class<? extends IDataBaseAdapter> dataBaseAdapterClass = HBaseDataBaseAdapter.class;
        private int putBufferSize = 2000;
        private boolean saveRecordFileDuringRecord = true;
        
        private ClickWatchRecordModuleBuilder() {
            // empty
        }
        
        public ClickWatchRecordModuleBuilder wDataBaseAdapterClass(Class<? extends IDataBaseAdapter> dataBaseAdapterClass) {
            this.dataBaseAdapterClass = dataBaseAdapterClass;
            return this;
        }

        public ClickWatchRecordModuleBuilder wPutBufferSize(int putBufferSize) {
            this.putBufferSize = putBufferSize;
            return this;
        }

        public ClickWatchRecordModuleBuilder wSaveRecordFileDuringRecord(boolean saveRecordFileDuringRecord) {
            this.saveRecordFileDuringRecord = saveRecordFileDuringRecord;
            return this;
        }
        
        public ClickWatchRecorderModule build() {
            return new ClickWatchRecorderModule() {
                @Override
                protected void configureSaveRecordFileDuringRecord() {
                    bind(Boolean.class).annotatedWith(Names.named(B_SAVE_RECORD_FILE)).toInstance(saveRecordFileDuringRecord);
                }

                @Override
                protected void configureDataBaseAdapter() {
                    bind(IDataBaseAdapter.class).to(dataBaseAdapterClass);
                }

                @Override
                protected void configurePutsBufferSize() {
                    bind(Integer.class).annotatedWith(Names.named(I_PUTS_BUFFER_SIZE)).toInstance(putBufferSize);
                }                
            };
        }        
    }

    public static ClickWatchRecordModuleBuilder newBuilder() {
        return new ClickWatchRecordModuleBuilder();
    }
}
