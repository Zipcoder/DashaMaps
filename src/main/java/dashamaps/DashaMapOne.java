package dashamaps;


import java.io.File;
import java.util.Scanner;

public class DashaMapOne extends DashaMap implements HashMapX {

    File file = new File("word-list.txt");
    Scanner scanner;

    public DashaMapOne()  {
        String key;
        String value;

        try {
            scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                key = scanner.next();
                value = scanner.next();

                set(key, value);
            }
            scanner.close();
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void set(String key, String value){
        for(int i = 0; i < 26; i++){
            if(map[i].getKey().equals(HashFunctionOne(key)))
                addNode(map[i], key, Integer.parseInt(value));
        }

    }
    public void addNode(Node node, String key, Integer value){
        Node temp = node;

        while(temp != null){
            if(temp.next == null){
                temp.next = new Node( key, value, node);
                break;
            }
            temp = temp.next;
        }
    }

    public Node find(String key){

        for(int i = 0 ; i < 26 ; i ++){
            if(map[i].getKey().equals(HashFunctionOne(key))){
                return map[i];
            }
        }
        return null;

    }


    public String delete(String key){
        Node head = find(key);
        String keyValue = "";
        while(head != null){
            if(head.getKey().equals(key)){
                keyValue = head.getKey();
            }
            head = head.getNext();
        }

        return "This Node was deleted : " + keyValue;    }

    public String get(String key){
        Node head = find(key);
        while(head != null){
            if(head.getKey().equals(key)){
                return head.getKey();
            }
            head = head.getNext();
        }
        return null;
    }


    public boolean isEmpty(){
        return false;
    }


    public long size(){
        return 0;
    }



    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }
}
