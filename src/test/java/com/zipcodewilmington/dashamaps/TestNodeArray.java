package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestNodeArray {

    @Test
    public void testInitNodeArray() {
        NodeArray nodes = new NodeArray();
        String actual = nodes.toString();
        String expected = "0\ta\n" +
                "1\tb\n" +
                "2\tc\n" +
                "3\td\n" +
                "4\te\n" +
                "5\tf\n" +
                "6\tg\n" +
                "7\th\n" +
                "8\ti\n" +
                "9\tj\n" +
                "10\tk\n" +
                "11\tl\n" +
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
    public void testGetNodeByKey() {
        NodeArray nodes = new NodeArray();
        String actual = nodes.getNodeByKey("s").getKey();
        String expected = "s";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetNodeByIndex() {
        NodeArray nodes = new NodeArray();
        String actual = nodes.getNodeByIndex(24).getKey();
        String expected = "y";
        Assert.assertEquals(expected, actual);

    }

}
