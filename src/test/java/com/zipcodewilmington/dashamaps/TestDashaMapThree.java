package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMapThree {
    @Test
    public void testSet() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "ap\n" +
                "\tapples\t245\n" +
                "go\n" +
                "\tgoogle\t345\n" +
                "la\n" +
                "\tlamp\t23\n" +
                "an\n" +
                "\tanagram\t33\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        DashaMap dashaMap = new DashaMapThree();
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
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        DashaMap dashaMap = new DashaMapThree();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void testBucketSize1() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("an"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMapThree();
        Assert.assertFalse(dashaMap.bucketSize("an"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "ap\n" +
                "\tapples\t245\n" +
                "go\n" +
                "\tgoogle\t345\n" +
                "la\n" +
                "\tlamp\t23\n" +
                "an\n" +
                "\tanagram\t33\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("ap");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.get("google");
        String expected = "345";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFillMapWithText() {
        DashaMap dashaMap = getMap();
        String actual = dashaMap.toStringBrief();
        String expected = "ii\n" +
                "\ti\t1\n" +
                "me\n" +
                "\tme\t2\n" +
                "my\n" +
                "\tmy\t2\n" +
                "\tmyself\t4\n" +
                "we\n" +
                "\twe\t7\n" +
                "\twere\t7\n" +
                "ou\n" +
                "\tour\t8\n" +
                "\tours\t12\n" +
                "\tourselves\t8\n" +
                "\tout\t88\n" +
                "yo\n" +
                "\tyou\t3\n" +
                "\tyour\t4\n" +
                "\tyours\t5\n" +
                "\tyourself\t8\n" +
                "\tyourselves\t0\n" +
                "he\n" +
                "\the\t2\n" +
                "\ther\t7\n" +
                "\thers\t8\n" +
                "\therself\t9\n" +
                "\there\t54\n" +
                "hi\n" +
                "\thim\t3\n" +
                "\this\t4\n" +
                "\thimself\t5\n" +
                "sh\n" +
                "\tshe\t6\n" +
                "\tshould\t6\n" +
                "it\n" +
                "\tit\t0\n" +
                "\tits\t3\n" +
                "\titself\t6\n" +
                "th\n" +
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
                "\tthen\t12\n" +
                "\tthere\t23\n" +
                "\tthan\t23\n" +
                "wh\n" +
                "\twhat\t574987\n" +
                "\twhich\t34\n" +
                "\twho\t56\n" +
                "\twhom\t87\n" +
                "\twhile\t8\n" +
                "\twhen\t6\n" +
                "\twhere\t8\n" +
                "\twhy\t7\n" +
                "am\n" +
                "\tam\t7\n" +
                "is\n" +
                "\tis\t8\n" +
                "ar\n" +
                "\tare\t9\n" +
                "wa\n" +
                "\twas\t6\n" +
                "be\n" +
                "\tbe\t8\n" +
                "\tbeen\t9\n" +
                "\tbeing\t13\n" +
                "\tbecause\t77\n" +
                "\tbetween\t123\n" +
                "\tbefore\t2\n" +
                "\tbelow\t7\n" +
                "ha\n" +
                "\thave\t4\n" +
                "\thas\t6\n" +
                "\thad\t7\n" +
                "\thaving\t88\n" +
                "do\n" +
                "\tdo\t2\n" +
                "\tdoes\t4\n" +
                "\tdoing\t6\n" +
                "\tdown\t34\n" +
                "di\n" +
                "\tdid\t5\n" +
                "aa\n" +
                "\ta\t7\n" +
                "an\n" +
                "\tan\t77\n" +
                "\tand\t9\n" +
                "\tany\t2\n" +
                "bu\n" +
                "\tbut\t23\n" +
                "if\n" +
                "\tif\t5\n" +
                "or\n" +
                "\tor\t6\n" +
                "as\n" +
                "\tas\t98\n" +
                "un\n" +
                "\tuntil\t7\n" +
                "\tunder\t6\n" +
                "of\n" +
                "\tof\t9\n" +
                "\toff\t5\n" +
                "at\n" +
                "\tat\t0\n" +
                "by\n" +
                "\tby\t6\n" +
                "fo\n" +
                "\tfor\t7\n" +
                "wi\n" +
                "\twith\t8\n" +
                "\twill\t76\n" +
                "ab\n" +
                "\tabout\t99\n" +
                "\tabove\t56\n" +
                "ag\n" +
                "\tagainst\t0\n" +
                "\tagain\t7\n" +
                "in\n" +
                "\tinto\t6\n" +
                "\tin\t76\n" +
                "du\n" +
                "\tduring\t7\n" +
                "af\n" +
                "\tafter\t6\n" +
                "to\n" +
                "\tto\t8\n" +
                "\ttoo\t87\n" +
                "fr\n" +
                "\tfrom\t45\n" +
                "up\n" +
                "\tup\t8\n" +
                "on\n" +
                "\ton\t98\n" +
                "\tonce\t54\n" +
                "\tonly\t23\n" +
                "ov\n" +
                "\tover\t34\n" +
                "fu\n" +
                "\tfurther\t77\n" +
                "ho\n" +
                "\thow\t8\n" +
                "al\n" +
                "\tall\t9\n" +
                "bo\n" +
                "\tboth\t34\n" +
                "ea\n" +
                "\teach\t6\n" +
                "fe\n" +
                "\tfew\t12\n" +
                "mo\n" +
                "\tmore\t65\n" +
                "\tmost\t72\n" +
                "ot\n" +
                "\tother\t9\n" +
                "so\n" +
                "\tsome\t12\n" +
                "\tso\t12\n" +
                "su\n" +
                "\tsuch\t54\n" +
                "no\n" +
                "\tno\t23\n" +
                "\tnor\t123\n" +
                "\tnot\t65\n" +
                "\tnow\t5\n" +
                "ow\n" +
                "\town\t76\n" +
                "sa\n" +
                "\tsame\t77\n" +
                "ve\n" +
                "\tvery\t54\n" +
                "ca\n" +
                "\tcan\t100\n" +
                "ju\n" +
                "\tjust\t12\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete() {
        DashaMap dashaMap = getMap();
        dashaMap.delete("yourself");
        Assert.assertNull(dashaMap.get("yourself"));
    }

    public DashaMap getMap() {
        DashaMap dashaMap = new DashaMapThree();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split(" +");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
