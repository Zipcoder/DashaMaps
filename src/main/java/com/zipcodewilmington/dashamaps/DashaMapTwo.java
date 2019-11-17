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

    public void add(String input, Integer value) {
        String key = hashFunctionTwo(input);
        Node<String, Integer> newNode = new Node<>(input, value);
        newNode.linkToPrev(getLastInnerNode(key));
    }

    public Node<String, Integer> getLastInnerNode(String key) {
        Node<String, Integer> node = nodeArray.getNodeByKey(key);
        while (node.hasNext()) node = node.getNext();
        return node;
    }

    public void set(String key, Integer value) {
        add(key, value);
    }

    public String delete(String input) {
        String key = hashFunctionTwo(input);
        String out = "";
        for (Node<String, Integer> node = getBucket(key).getNext(); node != null; node = node.getNext()) {
            if (node.getKey().equals(input)) {
                if (node.hasNext()) node.getNext().linkToPrev(node.getPrev());
                else node.getPrev().setNext(null);
                out = node.getKey();
                break;
            }
        }
        return out;
    }

    public String get(String input) {
        String key = hashFunctionTwo(input);
        String out;
        try {
            out = findInBucket(getBucket(key), input).toString();
        } catch(NullPointerException npe) {
            out = null;
        }
        return out;
    }
}
