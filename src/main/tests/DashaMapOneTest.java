import org.junit.Test;
import dashamaps.Node;

public class DashaMapOneTest {
    @Test
    public void testMapOne(){
        dashamaps.DashaMapOne map = new dashamaps.DashaMapOne();

        for(Node each : map.getMap()){
            System.out.println(each.toString());
        }
    }

}