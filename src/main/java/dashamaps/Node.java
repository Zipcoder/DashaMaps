package dashamaps;

public class Node {
    String key;
    Integer value;
    Node next;

    public Node(String key, Integer value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public boolean hasNext(){
        return (this.next != null);
    }

    public Node getNext(){
        return this.next;
    }
}
