package com.zipcodewilmington.dashamaps;

public class NodeArray {
    private Node<String, Integer> head;
    private Node<String, Integer> tail;
    final String[] alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(",");

    public NodeArray () {
        this.head = initNodeArray(this.alphabet);
    }

    public NodeArray (String placeholder) {
        this.head = null;
    }

    public Node<String, Integer> initNodeArray(String[] alphabet) {
        for (String letter : alphabet) {
            addAdjNode(String.valueOf(letter));
        }
        return this.head;
    }

    public void addAdjNode(String key){
        if (head != null) this.tail = linkPrev(new Node<>(key, null, null), this.getLast());
        else head = new Node<>(key, null, null);
    }

    public Node<String, Integer> linkPrev(Node<String, Integer> current, Node<String, Integer> prev) {
        current.setAdjPrev(prev).setAdjNext(current);
        return current;
    }
    public Node<String, Integer> getLast() {
        Node<String, Integer> node = head;
        while (node.hasAdjNext()) {
            node = node.getAdjNext();
        }
        if (!node.equals(head)) this.tail = node;
        return node;
    }

    public Node<String, Integer> getFirst() {
        return this.head;
//        Node<String, Integer> node = tail;
//        while (node.hasAdjPrev()) {
//            node = node.getAdjPrev();
//        }
//        return node;
    }

    public Node<String, Integer> getNodeByIndex(int index) {
        int count = 0;
        for (Node<String, Integer> node = this.head; node.hasAdjNext(); node = node.getAdjNext()) {
            if (count == index) return node;
            else count++;
        }
        return null;
    }

    public Node<String, Integer> getNodeByKey(String key) {
        for (Node<String, Integer> node = this.head; node != null; node = node.getAdjNext()) {
            if (node.getKey().equals(key)) return node;
        }
        return null;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        int i = 0;
        for (Node<String, Integer> node = this.head; node != null; node = node.getAdjNext()) {
            output.append(String.format("%s\t%s\n", i++, node.getKey()));
        }
        return output.toString();
    }
}
