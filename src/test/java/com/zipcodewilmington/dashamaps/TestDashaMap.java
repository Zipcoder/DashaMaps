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

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("a");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMap();
        dashaMap.add("catatonic", 245);
        dashaMap.add("castaway", 345);
        dashaMap.add("creates", 23);
        dashaMap.add("cantaloupe", 33);
        String actual = dashaMap.get("castaway");
        String expected = "345";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFillMapWithText() {
        DashaMap dashaMap = getMap();
        String actual = dashaMap.toStringBrief();
        String expected = "0\ta\n" +
                "\tam\t7\n" +
                "\tare\t9\n" +
                "\ta\t7\n" +
                "\tan\t77\n" +
                "\tand\t9\n" +
                "\tas\t98\n" +
                "\tat\t0\n" +
                "\tabout\t99\n" +
                "\tagainst\t0\n" +
                "\tafter\t6\n" +
                "\tabove\t56\n" +
                "\tagain\t7\n" +
                "\tall\t9\n" +
                "\tany\t2\n" +
                "1\tb\n" +
                "\tbe\t8\n" +
                "\tbeen\t9\n" +
                "\tbeing\t13\n" +
                "\tbut\t23\n" +
                "\tbecause\t77\n" +
                "\tby\t6\n" +
                "\tbetween\t123\n" +
                "\tbefore\t2\n" +
                "\tbelow\t7\n" +
                "\tboth\t34\n" +
                "2\tc\n" +
                "\tcan\t100\n" +
                "3\td\n" +
                "\tdo\t2\n" +
                "\tdoes\t4\n" +
                "\tdid\t5\n" +
                "\tdoing\t6\n" +
                "\tduring\t7\n" +
                "\tdown\t34\n" +
                "4\te\n" +
                "\teach\t6\n" +
                "5\tf\n" +
                "\tfor\t7\n" +
                "\tfrom\t45\n" +
                "\tfurther\t77\n" +
                "\tfew\t12\n" +
                "6\th\n" +
                "\the\t2\n" +
                "\thim\t3\n" +
                "\this\t4\n" +
                "\thimself\t5\n" +
                "\ther\t7\n" +
                "\thers\t8\n" +
                "\therself\t9\n" +
                "\thave\t4\n" +
                "\thas\t6\n" +
                "\thad\t7\n" +
                "\thaving\t88\n" +
                "\there\t54\n" +
                "\thow\t8\n" +
                "7\ti\n" +
                "\ti\t1\n" +
                "\tit\t0\n" +
                "\tits\t3\n" +
                "\titself\t6\n" +
                "\tis\t8\n" +
                "\tif\t5\n" +
                "\tinto\t6\n" +
                "\tin\t76\n" +
                "8\tj\n" +
                "\tjust\t12\n" +
                "9\tm\n" +
                "\tme\t2\n" +
                "\tmy\t2\n" +
                "\tmyself\t4\n" +
                "\tmore\t65\n" +
                "\tmost\t72\n" +
                "10\tn\n" +
                "\tno\t23\n" +
                "\tnor\t123\n" +
                "\tnot\t65\n" +
                "\tnow\t5\n" +
                "11\to\n" +
                "\tour\t8\n" +
                "\tours\t12\n" +
                "\tourselves\t8\n" +
                "\tor\t6\n" +
                "\tof\t9\n" +
                "\tout\t88\n" +
                "\ton\t98\n" +
                "\toff\t5\n" +
                "\tover\t34\n" +
                "\tonce\t54\n" +
                "\tother\t9\n" +
                "\tonly\t23\n" +
                "\town\t76\n" +
                "12\ts\n" +
                "\tshe\t6\n" +
                "\tsome\t12\n" +
                "\tsuch\t54\n" +
                "\tsame\t77\n" +
                "\tso\t12\n" +
                "\tshould\t6\n" +
                "13\tt\n" +
                "\tthey\t4\n" +
                "\tthem\t4\n" +
                "\ttheir\t5\n" +
                "\ttheirs\t6\n" +
                "\tthemselves\t123\n" +
                "\tthis\t5\n" +
                "\tthat\t7\n" +
                "\tthese\t9\n" +
                "\tthose\t7\n" +
                "\tthe\t8\n" +
                "\tthrough\t6\n" +
                "\tto\t8\n" +
                "\tthen\t12\n" +
                "\tthere\t23\n" +
                "\tthan\t23\n" +
                "\ttoo\t87\n" +
                "14\tu\n" +
                "\tuntil\t7\n" +
                "\tup\t8\n" +
                "\tunder\t6\n" +
                "15\tv\n" +
                "\tvery\t54\n" +
                "16\tw\n" +
                "\twe\t7\n" +
                "\twhat\t574987\n" +
                "\twhich\t34\n" +
                "\twho\t56\n" +
                "\twhom\t87\n" +
                "\twas\t6\n" +
                "\twere\t7\n" +
                "\twhile\t8\n" +
                "\twith\t8\n" +
                "\twhen\t6\n" +
                "\twhere\t8\n" +
                "\twhy\t7\n" +
                "\twill\t76\n" +
                "17\ty\n" +
                "\tyou\t3\n" +
                "\tyour\t4\n" +
                "\tyours\t5\n" +
                "\tyourself\t8\n" +
                "\tyourselves\t0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete() {
        DashaMap dashaMap = getMap();
        dashaMap.delete("yourself");
        Assert.assertNull(dashaMap.get("yourself"));
    }

    public DashaMap getMap() {
        DashaMap dashaMap = new DashaMap();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split("[ ]+");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
