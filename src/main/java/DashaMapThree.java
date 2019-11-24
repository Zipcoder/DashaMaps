


public class DashaMapThree extends Node implements HashMapX {

    private Node[] buckets;

    public DashaMapThree(){
        this.initBuckets();
    }


    private static String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    private void initBuckets(){
        this.buckets = new Node[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < this.buckets.length; i++){
            this.buckets[i] = new Node();
            this.buckets[i].setKey(String.valueOf(alpha.charAt(i)));
        }
    }

    private void appendTo(Node head, Node newNode){
        while (head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    public Node findFirst(String key){
        Node head;
        try {
            char letter = HashFunctionOne(key).charAt(0);
            head = buckets[(letter - 'a') % 26];
        } catch (NullPointerException e){
            head = null;
        }
        return head;
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
        return size() == 0;
    }

    @Override
    public long size() {
        long size = 0;
        for (Node n : this.buckets){
            while (n.next != null){
                n = n.next;
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean bucketSize(String key) {
        Node head = findFirst(key);
        return head.next == null;
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
