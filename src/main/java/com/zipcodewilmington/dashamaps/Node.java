package com.zipcodewilmington.dashamaps;

import javafx.util.Pair;

public class Node<K, V> {
    private K key;
    private V value;

    private Node<K, V> next;
    private Node<K, V> prev;

    private Node<K, V> adjPrev;
    private Node<K, V> adjNext;

    public Node (K key, V value) {
        this.prev = null;
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public Node(K key, Node<K, V> adjPrev, Node<K, V> adjNext) {
        this.prev = null;
        this.key = key;
        this.next = null;
        this.adjPrev = adjPrev;
        this.adjNext = adjNext;
    }

//    public Boolean hasAdjPrev() {
//        return adjPrev != null;
//    }
//    public Node<K, V> getAdjPrev() {
//        return this.adjPrev;
//    }
    public Node<K, V> setAdjPrev(Node<K, V> adjPrev) {
        this.adjPrev = adjPrev;
        return this.adjPrev;
    }

    public Boolean hasAdjNext() {
        return adjNext != null;
    }
    public Node<K, V> getAdjNext() {
        return this.adjNext;
    }
    public Node<K, V> setAdjNext(Node<K, V> adjNext) {
        this.adjNext = adjNext;
        return this.adjNext;
    }

    public Node<K, V> getPrev() {
        return this.prev;
    }

    public Node<K, V> setPrev(Node<K, V> prev) {
        this.prev = prev;
        return this.prev;
    }

//    public Boolean hasPrev() {
//        return (prev != null);
//    }

    public K getKey() {
        return this.key;
    }

//    public Node<K, V> setKey(K key) {
//        this.key = key;
//        return this;
//    }

    public V getValue() {
        return this.value;
    }

//    public Node<K, V> setValue(V value) {
//        this.value = value;
//        return this;
//    }

//    public Pair<K, V> getPair() {
//        return new Pair<>(this.key, this.value);
//    }

//    public Node<K, V> setPair(K key, V value) {
//        this.setKey(key);
//        this.setValue(value);
//        return this;
//    }

//    public Node<K, V> setPair(Pair<K, V> pair) {
//
//        this.setKey(pair.getKey());
//        this.setValue(pair.getValue());
//        return this;
//    }

    public Node<K, V> getNext() {
        return this.next;
    }

    public Node<K, V> setNext(Node<K, V> next) {
        this.next = next;
        return this.next;
    }

    public Boolean hasNext() {
        return (next != null);
    }

//    public Boolean compareTo(Node<K, V> next) {
//        return (this.getKey().toString().compareToIgnoreCase(next.getKey().toString()) > 0);
//    }

//    public void swapNext() {
//        Pair<K, V> pair = getPair();
//        this.setPair(next.getPair()).getNext().setPair(pair);
//    }

    public void linkToPrev(Node<K, V> prev) {
        this.setPrev(prev).setNext(this);
    }

}
