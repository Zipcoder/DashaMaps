package io.zipcode.rocks.dashamap;

public interface HashMapX {
    // fundamentals
    void set(String key, Integer value);

    void delete(String key);

    Integer get(String key);

    boolean isEmpty();

    long size();

    Integer bucketSize(String key); // used for tests
}
