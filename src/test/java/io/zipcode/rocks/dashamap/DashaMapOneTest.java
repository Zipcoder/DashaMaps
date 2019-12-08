package io.zipcode.rocks.dashamap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DashaMapOneTest {
    DashaMapOne dmap;

    @Before
    public void init() {
        dmap = new DashaMapOne();
        dmap.set("Kai", 1);
        dmap.set("Val", 2);
        dmap.set("Kendra", 3);
        dmap.set("Wes", 4);
        dmap.set("Ryan", 6);
    }

    @Test
    public void setTest1() {
        Integer actual = dmap.get("Kai");
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest2() {
        Integer expected = 5;
        dmap.set("Kane", 5);
        Integer actual = dmap.get("Kane");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        dmap.delete("Kai");
        Assert.assertEquals(null, dmap.get("Ice cream"));
    }

    @Test
    public void isEmptyTest1() {
        Assert.assertFalse(dmap.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        dmap.delete("Kai");
        dmap.delete("Val");
        dmap.delete("Kendra");
        dmap.delete("Wes");
        dmap.delete("Ryan");
        Assert.assertTrue(dmap.isEmpty());
    }

    @Test
    public void sizeTest() {
        Integer expected = 5;
        Assert.assertEquals(expected, dmap.size);
    }

    @Test
    public void bucketSizeTest() {
        dmap.set("Kevin", 40);
        dmap.set("Kory", 20);
        dmap.set("Kaila", 10);
        Integer expected = 5;
        Assert.assertEquals(expected, dmap.bucketSize("K"));
    }
}