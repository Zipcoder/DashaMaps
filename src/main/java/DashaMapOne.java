package


public class DashaMapOne extends Node implements HashMapX {


    private Node[] buckets;

    public DashaMapOne() {
        this.buckets = initBuckets();
    }


    public void Node[]initBuckets(){
        Node[] buckets = new Node[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alpha.length(); i++) {
            buckets[i] = new Node();
            buckets[i].setKey(String.valueOf(alpha.charAt(i)));
        }
    }

    private static String HashFunctionOne(String input){
        if (input.length() > 0){
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    @Override
    public void set(String key, String value) {
        Node head = findFirst(key);
        Node newVal = new Node(key, Integer.valueOf(value));
        appendTo(head, newVal);
    }


    @Override
    public String delete(String key) {
        Node head = findFirst(key);

        while (head.next != null){
            if (head.next.key.equals(key)){
                head.next = head.next.next;
                return "Deleted";
            }
            head = head.next;
        }
        return "Not found";
    }

    @Override
    public String get(String key) {
        Node head = findFirst(key);

        while (head.next != null){
            head = head.next;
            if (head.key.equals(key)){
                return head.value;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public long size() {
        long size = 0;
        for(Node n : this.buckets){
            while (n.next != null){
                n = n.next;
            }
        }
        return size;
    }

    @Override
    public boolean bucketSize(String key) {
        Node head = findFirst(key);
        return head.next == null;
    }

    public Node[] getBuckets() {
        return buckets;
    }

    public void setBuckets(Node[] buckets) {
        this.buckets = buckets;
    }

    public void printMap(){
        for (Node n : this.buckets){
            while (n.next != null){
                n = n.next;
                System.out.println(n.toString());
            }
        }
    }

}
