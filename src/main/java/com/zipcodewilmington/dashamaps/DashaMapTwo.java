package com.zipcodewilmington.dashamaps;

public class DashaMapTwo extends DashaMap {

    public DashaMapTwo() {
        super();
    }

    private String hashFunctionTwo(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(1)).toLowerCase();
        }
        return String.valueOf(input.charAt(0)).toLowerCase();
    }

    public void set(String input, Integer value) {
        String key = hashFunctionTwo(input);
        performSet(key, input, value);
    }

    public String delete(String input) {
        String key = hashFunctionTwo(input);
        return performDelete(input, key);
    }

    public String get(String input) {
        String key = hashFunctionTwo(input);
        return performGet(input, key);
    }
}
