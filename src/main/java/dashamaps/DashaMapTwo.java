package dashamaps;

public class DashaMapTwo extends DashaMap{
    // if Key = dog; this would use the second letter "o".

    @Override
    protected String HashFunction(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(1)).toLowerCase();
        }
        return null;
    }
}
