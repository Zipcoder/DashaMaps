
import org.junit.Test;
import org.junit.Assert;


public class Test {

    private DashaMapOne d;

    @Before
    public void setUp(){
        d = new DashaMapOne();
        d.set("Abra", "1");
        d.set("Kadabra", "6");
        d.set("Alakazam", "9");
        d.set("Connor", "29");
    }


    @Test
    public void testSize(){
        long expected = 4;
        long actual = d.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNotEmpty(){
        Assert.assertFalse(d.isEmpty());
    }

    @Test
    public void testEmpty(){
        d = new DashaMapOne();
        Assert.assertTrue(d.isEmpty());
    }

    @Test
    public void testGetAbra(){
        Integer expected = 1;
        Integer actual = d.get("Abra");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKadabra(){
        Integer expected = 6;
        Integer actual = d.get("Kadabra");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAlakazam(){
        Integer expected = 9;
        Integer actual = d.get("Alakazam");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetConnor(){
        Integer expected = 29;
        Integer actual = d.get("Connor");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNotPresent(){
        Integer actual = d.get("sdfgsdf");

        Assert.assertNull(actual);
    }

    @Test
    public void testDelete(){
        String expected = "Deleted";
        String actual = d.delete("Connor");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeAfterDelete(){
        long expected = 3;
        d.delete("Connor");
        long actual = d.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeleteMultipleInBucket(){
        long expected = 3;
        d.delete("Abra");
        long actual = d.size();

        Assert.assertEquals(expected, actual);
    }

}

