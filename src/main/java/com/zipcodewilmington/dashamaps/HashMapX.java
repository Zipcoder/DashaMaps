package com.zipcodewilmington.dashamaps;

public interface HashMapX {
    void set(String key, Integer value);

    String delete(String key);

    String get(String key);

    Boolean isEmpty();

    Long size();
}
