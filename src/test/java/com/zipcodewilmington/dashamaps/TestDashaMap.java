package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMap {

    @Test
    public void testAdd() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "a\n" +
                "\tapples\t245\n" +
                "\tanagram\t33\n" +
                "b\n" +
                "c\n" +
                "d\n" +
                "e\n" +
                "f\n" +
                "g\n" +
                "\tgoogle\t345\n" +
                "h\n" +
                "i\n" +
                "j\n" +
                "k\n" +
                "l\n" +
                "\tlamp\t23\n" +
                "m\n" +
                "n\n" +
                "o\n" +
                "p\n" +
                "q\n" +
                "r\n" +
                "s\n" +
                "t\n" +
                "u\n" +
                "v\n" +
                "w\n" +
                "x\n" +
                "y\n" +
                "z\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Long actual = dashaMap.size();
        Long expected = 4L;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty1() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        DashaMap dashaMap = new DashaMapOne();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void testBucketSize1() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("a"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMapOne();
        Assert.assertFalse(dashaMap.bucketSize("a"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "a\n" +
                "\tapples\t245\n" +
                "\tanagram\t33\n" +
                "g\n" +
                "\tgoogle\t345\n" +
                "l\n" +
                "\tlamp\t23\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("a");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMapOne();
        dashaMap.set("catatonic", 245);
        dashaMap.set("castaway", 345);
        dashaMap.set("creates", 23);
        dashaMap.set("cantaloupe", 33);
        String actual = dashaMap.get("castaway");
        String expected = "345";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFillMapWithText() {
        DashaMap dashaMap = getMap();
        String actual = dashaMap.toStringBrief();
        String expected = "a\n" +
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
                "b\n" +
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
                "c\n" +
                "\tcan\t100\n" +
                "d\n" +
                "\tdo\t2\n" +
                "\tdoes\t4\n" +
                "\tdid\t5\n" +
                "\tdoing\t6\n" +
                "\tduring\t7\n" +
                "\tdown\t34\n" +
                "e\n" +
                "\teach\t6\n" +
                "f\n" +
                "\tfor\t7\n" +
                "\tfrom\t45\n" +
                "\tfurther\t77\n" +
                "\tfew\t12\n" +
                "h\n" +
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
                "i\n" +
                "\ti\t1\n" +
                "\tit\t0\n" +
                "\tits\t3\n" +
                "\titself\t6\n" +
                "\tis\t8\n" +
                "\tif\t5\n" +
                "\tinto\t6\n" +
                "\tin\t76\n" +
                "j\n" +
                "\tjust\t12\n" +
                "m\n" +
                "\tme\t2\n" +
                "\tmy\t2\n" +
                "\tmyself\t4\n" +
                "\tmore\t65\n" +
                "\tmost\t72\n" +
                "n\n" +
                "\tno\t23\n" +
                "\tnor\t123\n" +
                "\tnot\t65\n" +
                "\tnow\t5\n" +
                "o\n" +
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
                "s\n" +
                "\tshe\t6\n" +
                "\tsome\t12\n" +
                "\tsuch\t54\n" +
                "\tsame\t77\n" +
                "\tso\t12\n" +
                "\tshould\t6\n" +
                "t\n" +
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
                "u\n" +
                "\tuntil\t7\n" +
                "\tup\t8\n" +
                "\tunder\t6\n" +
                "v\n" +
                "\tvery\t54\n" +
                "w\n" +
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
                "y\n" +
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
        DashaMap dashaMap = new DashaMapOne();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split("[ ]+");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
