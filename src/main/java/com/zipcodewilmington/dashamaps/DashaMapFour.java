package com.zipcodewilmington.dashamaps;

public class DashaMapFour extends DashaMap {

    public DashaMapFour () {
        this.nodeArray = new NodeArray("");
    }

    private String hashFunctionFour(String input) {
        if (input.length() > 2) return (String.valueOf(input.charAt(0))+input.charAt(input.length()-1)+input.charAt(input.length()-2)).toLowerCase();
        else if (input.length() > 1) return (String.valueOf(input.charAt(0))+input.charAt(1)).toLowerCase();
        else return (String.valueOf(input.charAt(0))+input.charAt(0)).toLowerCase();
    }

    public void set(String input, Integer value) {
        String key = hashFunctionFour(input);
        performSet(key, input, value);
    }

    public String delete(String input) {
        String key = hashFunctionFour(input);
        if (hasHashNode(key)) return performDelete(input, key);
        else return String.format("deletion failed: item %s not found", input);
    }

    public String get(String input) {
        String key = hashFunctionFour(input);
        return performGet(input, key);
    }


}
