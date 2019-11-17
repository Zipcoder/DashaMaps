package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMap {

    @Test
    public void testAdd() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "0\ta\n" +
                "\tapples\t245\n" +
                "\tanagram\t33\n" +
                "1\tb\n" +
                "2\tc\n" +
                "3\td\n" +
                "4\te\n" +
                "5\tf\n" +
                "6\tg\n" +
                "\tgoogle\t345\n" +
                "7\th\n" +
                "8\ti\n" +
                "9\tj\n" +
                "10\tk\n" +
                "11\tl\n" +
                "\tlamp\t23\n" +
                "12\tm\n" +
                "13\tn\n" +
                "14\to\n" +
                "15\tp\n" +
                "16\tq\n" +
                "17\tr\n" +
                "18\ts\n" +
                "19\tt\n" +
                "20\tu\n" +
                "21\tv\n" +
                "22\tw\n" +
                "23\tx\n" +
                "24\ty\n" +
                "25\tz\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        Long actual = dashaMap.size();
        Long expected = 4L;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty1() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        DashaMap dashaMap = new DashaMap();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void testBucketSize1() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("a"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMap();
        Assert.assertFalse(dashaMap.bucketSize("a"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "0\ta\n" +
                "\tapples\t245\n" +
                "\tanagram\t33\n" +
                "1\tg\n" +
                "\tgoogle\t345\n" +
                "2\tl\n" +
                "\tlamp\t23\n";
        Assert.assertEquals(expected, actual);
    }
}
