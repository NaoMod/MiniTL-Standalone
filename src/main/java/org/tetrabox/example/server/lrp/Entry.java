package org.tetrabox.example.server.lrp;

public class Entry<T> {
    private String key;
    private T value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}
