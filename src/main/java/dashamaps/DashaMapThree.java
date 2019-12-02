package dashamaps;

public class DashaMapThree implements HashMapX {
    public void set(String key, String value){

    }
    public String delete(String key){
        return null;
    }

    public String get(String key){
        Node head = find(key);
        while(head != null){
            if(head.getKey().equals(key)){
                return head.getKey();
            }
            head = head.getNext();
        }
        return null;    }


    public boolean isEmpty(){
        return false;
    }


    public long size(){
        return 0;
    }


}
