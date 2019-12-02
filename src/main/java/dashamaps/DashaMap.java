package dashamaps;

import dashamaps.Node;

public class DashaMap {

    private String a_z = "abcdefghijklmnopqrstuvwxyz";
    Node[] map = new Node[26];

    public DashaMap(){
        for(int i = 0; i < a_z.length(); i++){
            map[i] = new Node("a",1, next );
            map[i].setKey(String.valueOf(a_z.charAt(i)));
        }
    }

    public Node[] getMap() {
        return map;
    }
}