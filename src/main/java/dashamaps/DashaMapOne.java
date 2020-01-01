package dashamaps;

public class DashaMapOne extends DashaMap{

    @Override
    protected String HashFunction(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(0)).toLowerCase());
        }
        return null;
    }
}
