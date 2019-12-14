package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMapTwo {

    @Test
    public void testAdd() {
        DashaMap dashaMap = new DashaMapTwo();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "a\n" +
                "\tlamp\t23\n" +
                "b\n" +
                "c\n" +
                "d\n" +
                "e\n" +
                "f\n" +
                "g\n" +
                "h\n" +
                "i\n" +
                "j\n" +
                "k\n" +
                "l\n" +
                "m\n" +
                "n\n" +
                "\tanagram\t33\n" +
                "o\n" +
                "\tgoogle\t345\n" +
                "p\n" +
                "\tapples\t245\n" +
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
        DashaMap dashaMap = new DashaMapTwo();
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
        DashaMap dashaMap = new DashaMapTwo();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        DashaMap dashaMap = new DashaMapTwo();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void testBucketSize1() {
        DashaMap dashaMap = new DashaMapTwo();
        dashaMap.set("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("n"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMapTwo();
        Assert.assertFalse(dashaMap.bucketSize("a"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMapTwo();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "a\n" +
                "\tlamp\t23\n" +
                "n\n" +
                "\tanagram\t33\n" +
                "o\n" +
                "\tgoogle\t345\n" +
                "p\n" +
                "\tapples\t245\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMapTwo();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("p");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMapTwo();
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
                "\twas\t6\n" +
                "\thave\t4\n" +
                "\thas\t6\n" +
                "\thad\t7\n" +
                "\thaving\t88\n" +
                "\ta\t7\n" +
                "\teach\t6\n" +
                "\tsame\t77\n" +
                "\tcan\t100\n" +
                "b\n" +
                "\tabout\t99\n" +
                "\tabove\t56\n" +
                "e\n" +
                "\tme\t2\n" +
                "\twe\t7\n" +
                "\the\t2\n" +
                "\ther\t7\n" +
                "\thers\t8\n" +
                "\therself\t9\n" +
                "\twere\t7\n" +
                "\tbe\t8\n" +
                "\tbeen\t9\n" +
                "\tbeing\t13\n" +
                "\tbecause\t77\n" +
                "\tbetween\t123\n" +
                "\tbefore\t2\n" +
                "\tbelow\t7\n" +
                "\there\t54\n" +
                "\tfew\t12\n" +
                "\tvery\t54\n" +
                "f\n" +
                "\tif\t5\n" +
                "\tof\t9\n" +
                "\tafter\t6\n" +
                "\toff\t5\n" +
                "g\n" +
                "\tagainst\t0\n" +
                "\tagain\t7\n" +
                "h\n" +
                "\tshe\t6\n" +
                "\tthey\t4\n" +
                "\tthem\t4\n" +
                "\ttheir\t5\n" +
                "\ttheirs\t6\n" +
                "\tthemselves\t123\n" +
                "\twhat\t574987\n" +
                "\twhich\t34\n" +
                "\twho\t56\n" +
                "\twhom\t87\n" +
                "\tthis\t5\n" +
                "\tthat\t7\n" +
                "\tthese\t9\n" +
                "\tthose\t7\n" +
                "\tthe\t8\n" +
                "\twhile\t8\n" +
                "\tthrough\t6\n" +
                "\tthen\t12\n" +
                "\tthere\t23\n" +
                "\twhen\t6\n" +
                "\twhere\t8\n" +
                "\twhy\t7\n" +
                "\tthan\t23\n" +
                "\tshould\t6\n" +
                "i\n" +
                "\ti\t1\n" +
                "\thim\t3\n" +
                "\this\t4\n" +
                "\thimself\t5\n" +
                "\tdid\t5\n" +
                "\twith\t8\n" +
                "\twill\t76\n" +
                "l\n" +
                "\tall\t9\n" +
                "m\n" +
                "\tam\t7\n" +
                "n\n" +
                "\tan\t77\n" +
                "\tand\t9\n" +
                "\tuntil\t7\n" +
                "\tinto\t6\n" +
                "\tin\t76\n" +
                "\ton\t98\n" +
                "\tunder\t6\n" +
                "\tonce\t54\n" +
                "\tany\t2\n" +
                "\tonly\t23\n" +
                "o\n" +
                "\tyou\t3\n" +
                "\tyour\t4\n" +
                "\tyours\t5\n" +
                "\tyourself\t8\n" +
                "\tyourselves\t0\n" +
                "\tdo\t2\n" +
                "\tdoes\t4\n" +
                "\tdoing\t6\n" +
                "\tfor\t7\n" +
                "\tto\t8\n" +
                "\tdown\t34\n" +
                "\thow\t8\n" +
                "\tboth\t34\n" +
                "\tmore\t65\n" +
                "\tmost\t72\n" +
                "\tsome\t12\n" +
                "\tno\t23\n" +
                "\tnor\t123\n" +
                "\tnot\t65\n" +
                "\tso\t12\n" +
                "\ttoo\t87\n" +
                "\tnow\t5\n" +
                "p\n" +
                "\tup\t8\n" +
                "r\n" +
                "\tare\t9\n" +
                "\tor\t6\n" +
                "\tfrom\t45\n" +
                "s\n" +
                "\tis\t8\n" +
                "\tas\t98\n" +
                "t\n" +
                "\tit\t0\n" +
                "\tits\t3\n" +
                "\titself\t6\n" +
                "\tat\t0\n" +
                "\tother\t9\n" +
                "u\n" +
                "\tour\t8\n" +
                "\tours\t12\n" +
                "\tourselves\t8\n" +
                "\tbut\t23\n" +
                "\tduring\t7\n" +
                "\tout\t88\n" +
                "\tfurther\t77\n" +
                "\tsuch\t54\n" +
                "\tjust\t12\n" +
                "v\n" +
                "\tover\t34\n" +
                "w\n" +
                "\town\t76\n" +
                "y\n" +
                "\tmy\t2\n" +
                "\tmyself\t4\n" +
                "\tby\t6\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete() {
        DashaMap dashaMap = getMap();
        dashaMap.delete("yourself");
        Assert.assertNull(dashaMap.get("yourself"));
    }

    public DashaMap getMap() {
        DashaMap dashaMap = new DashaMapTwo();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split("[ ]+");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
