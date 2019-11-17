package com.zipcodewilmington.dashamaps;

public class DashaMapOne extends DashaMap {

    public DashaMapOne() {
        super();
    }

    private String hashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    public void set(String input, Integer value) {
        String key = hashFunctionOne(input);
        performSet(key, input, value);
    }

    public String delete(String input) {
        String key = hashFunctionOne(input);
        return performDelete(input, key);
    }

    public String get(String input) {
        String key = hashFunctionOne(input);
        return performGet(input, key);
    }
}
