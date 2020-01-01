package dashamaps;

public class DashaMapThree extends DashaMap {

    @Override
    protected String HashFunction(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(0)).toLowerCase() + String.valueOf(input.charAt(1)).toLowerCase();
        }
        return null;
    }

    @Override
    public long bucketSize(String key) {
        String result = HashFunction(key);
        int index = convertChar(result);
        Node current = dashaNode[index];

        int length = 0;
        while(current != null){
            String check = current.key.substring(0,2).toLowerCase();
            if(check.equals(result)) {
                length++;
            }
            current = current.next;
        }

        return length;
    }
}
