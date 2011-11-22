package de.hub.clickwatch.recorder.examples.table;

public interface Table {
    
    enum KeyType { MAP, LIST, INDEX };
    
    public interface KeyPart {
        
    }
    
    public interface Key {
        
        public void addColumn(String name, KeyType type, Object value);
        
        public void addColumn(KeyPart keyPart);
    }
    
    public void addColumn(String name, KeyType type, Object initialValue);
    
    public void addValue(Key key, Object value);

    public Object get(Key key);
}
