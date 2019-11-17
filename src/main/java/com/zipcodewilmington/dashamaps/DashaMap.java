package com.zipcodewilmington.dashamaps;

public abstract class DashaMap implements HashMapX {
    public NodeArray nodeArray;

    public DashaMap() {
        nodeArray = new NodeArray();
    }

    public Node<String, Integer> getLastInnerNode(String key) {
        Node<String, Integer> node = nodeArray.getNodeByKey(key);
        while (node.hasNext()) node = node.getNext();
        return node;
    }

    public void performSet(String key, String input, Integer value) {
        if (!hasHashNode(key)) nodeArray.addAdjNode(key);
        Node<String, Integer> newNode = new Node<>(input, value);
        newNode.linkToPrev(getLastInnerNode(key));
    }

//    public abstract void set(String input, Integer value);// {
//        String key = input.substring(0, 1);
//        performSet(key, input, value);
//    }

    public String performDelete(String input, String key) {
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

//    public abstract String delete(String input);// {
//        String key = input.substring(0, 1);
//        return performDelete(input, key);
//    }

    public String performGet(String input, String key) {
        String out;
        try {
            out = findInBucket(getBucket(key), input).toString();
        } catch(NullPointerException npe) {
            out = null;
        }
        return out;
    }

//    public abstract String get(String input);// {
//        String key = input.substring(0,1);
//        return performGet(input, key);
//    }

    public Boolean isEmpty() {
        return (this.size() == 0L);
    }

    public Long size() {
        Long size = 0L;
        for (Node<String, Integer> node = nodeArray.getFirst(); node != null; node = node.getAdjNext()) {
            for(Node<String, Integer> innerNode = nodeArray.getNodeByKey(node.getKey()).getNext(); innerNode != null; innerNode = innerNode.getNext()) {
                size += 1;
            }
        }
        return size;
    }

    protected Boolean bucketSize(String key) {
        int size = 0;
        for (Node<String, Integer> node = getBucket(key); node != null; node = node.getNext()) {
            size++;
        }
        return size > 1;
    }

    public Node<String, Integer> getBucket(String key) {
        return nodeArray.getNodeByKey(key);
    }

    public Integer findInBucket(Node<String, Integer> bucket, String input) {
        Integer value = null;
        for (Node<String, Integer> node = bucket.getNext(); node != null; node = node.getNext()) {
            if (node.getKey().equals(input)) {
                value = node.getValue();
                break;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Node<String, Integer> node = nodeArray.getFirst(); node != null; node = node.getAdjNext()) {
            output.append(String.format("%s\n", node.getKey()));
            output.append(mappedItemsToString(node.getKey()));
        }
        return output.toString();
    }

    public String toStringBrief() {
        StringBuilder output = new StringBuilder();
        for (Node<String, Integer> node = nodeArray.getFirst(); node != null; node = node.getAdjNext()) {
            if (node.getNext() != null) {
                output.append(String.format("%s\n", node.getKey()));
                output.append(mappedItemsToString(node.getKey()));
            }
        }
        return output.toString();
    }

    public String mappedItemsToString(String key) {
        StringBuilder output = new StringBuilder();
        for(Node<String, Integer> innerNode = nodeArray.getNodeByKey(key).getNext(); innerNode != null; innerNode = innerNode.getNext()) {
            output.append(String.format("\t%s\t%s\n", innerNode.getKey(), innerNode.getValue()));
        }
        return output.toString();
    }

    public Boolean hasHashNode(String key) {
        return (nodeArray.getNodeByKey(key) != null);
    }




//    public DashaMap(K key, V value) {
//        this.head = new Node<K, V>(key, value);
//        this.count = 1;
//    }

//    public Node<String, Integer> linkPrev(Node<, Integer> current, Node<K, V> prev) {
//        current.setPrev(prev).setNext(current);
////        current.getPrev().setNext(current);
//        return current;
//    }

//    public Node<K, V> getLast() {
//        Node<K, V> node = head;
//        while (node.hasNext()) {
//            node = node.getNext();
//        }
//        if (!node.equals(head)) this.tail = node;
//        return node;
//    }

//    public Node<K, V> getFirst() {
//        Node<K, V> node = tail;
//        while (node.hasPrev()) {
//            node = node.getPrev();
//        }
//        return node;
//    }


//    public void connectAroundNodes(Node<K, V> node) {
//        if (node.hasPrev()) node.getPrev().setNext(node.getNext());
//        else head = node.getNext();
//
//        if (node.hasNext()) node.getNext().setPrev(node.getPrev());
//        else tail = node.getPrev();
//        count -= 1;
//    }

//    public void removeByKey(K key) {
//        for (Node<K, V> node = this.head; node != null; node = node.getNext()) {
//            if (node.getKey().equals(key)) {
//                connectAroundNodes(node);
//                break;
//            }
//        }
//    }
//
//    public void removeByValue(V value) {
//        for (Node<K, V> node = this.head; node != null; node = node.getNext()) {
//            if (node.getValue().equals(value)) {
//                connectAroundNodes(node);
//                break;
//            }
//        }
//    }

//    public Boolean containsKey(K key) {
//        Boolean exists = false;
//        for (Node<K, V> node = this.head; node != null; node = node.getNext()) {
//            if (node.getValue().equals(key)) {
//                exists = true;
//                break;
//            }
//        }
//        return exists;
//    }

//    public Boolean containsValue(V value) {
//        Boolean exists = false;
//        for (Node<K, V> node = this.head; node != null; node = node.getNext()) {
//            if (node.getValue().equals(value)) {
//                exists = true;
//                break;
//            }
//        }
//        return exists;
//    }

//    public Integer find(V value) {
//        Integer index = 0;
//        for (Node<K, V> node = head; node != null; node = node.getNext()) {
//            if (node.getValue().equals(value)) break;
//            index += 1;
//        }
//        return (index < this.size()) ? index : -1;
//    }
//
//    public Integer size() {
//        return this.count;
//    }
//
//    public V get(K key) {
//        V value = null;
//        int count = 0;
//        for (Node<K, V> node = this.head; node != null; node = node.getNext()) {
//            if (node.getKey().equals(key)) {
//                value = node.getValue();
//                break;
//            }
//            count += 1;
//        }
//        return value;
//    }
//
//    public DashaMap<K, V> copy() {
//        return this;
//    }
//
//    public DashaMap<K, V> sort() {
//        Boolean sorted = false;
//        while (!sorted) {
//            sorted = true;
//
//            for (Node<K, V> node = this.head; node.hasNext(); node = node.getNext()) {
//                if (node.compareTo(node.getNext())) {
//                    node.swapNext();
//                    sorted = false;
//                }
//            }
//        }
//        return this;
//    }

//    public DashaMap<K, V> reverse() {
//        DashaMap<K, V> map = new DashaMap<K, V>();
//        for (Node<K, V> node = this.tail; node != null; node = node.getPrev()) {
//            map.add(node.getPair());
//        }
//        return list;
//    }
//
//    public DashaMap<E> slice(Integer startIndex, Integer upToIndex) {
//        DashaMap<E> list = new DashaMap<E>();
//        for (int i = startIndex; i < upToIndex; i++) {
//            list.add(this.get(i));
//        }
//        return list;
//    }


}

