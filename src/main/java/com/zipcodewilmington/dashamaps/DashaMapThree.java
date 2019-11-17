package com.zipcodewilmington.dashamaps;

public class DashaMapThree extends DashaMap {
    //TODO rewrite to make DashaMapThree work
    private String hashFunctionThree(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(0)+input.charAt(1)).toLowerCase();
        }
        return String.valueOf(input.charAt(0)+input.charAt(0)).toLowerCase();
    }

    public void add(String input, Integer value) {
        String key = hashFunctionThree(input);
        Node<String, Integer> newNode = new Node<>(key, value);
        newNode.linkToPrev(getLastInnerNode(key.substring(0,1)));
    }

    public Node<String, Integer> getLastInnerNode(String key) {
        Node<String, Integer> node = nodeArray.getNodeByKey(key.substring(0,1));
        while (node.hasNext()) node = node.getNext();
        return node;
    }

    public void set(String key, Integer value) {
        add(key, value);
    }

    public String delete(String input) {
        String key = hashFunctionThree(input);
        String out = "";
        for (Node<String, Integer> node = getBucket(key.substring(0,1)).getNext(); node != null; node = node.getNext()) {
            if (node.getKey().equals(key)) {
                if (node.hasNext()) node.getNext().linkToPrev(node.getPrev());
                else node.getPrev().setNext(null);
                out = node.getKey();
                break;
            }
        }
        return out;
    }

    public String get(String input) {
        String key = hashFunctionThree(input);
        String out;
        try {
            out = findInBucket(getBucket(key), input).toString();
        } catch(NullPointerException npe) {
            out = null;
        }
        return out;
    }
}
