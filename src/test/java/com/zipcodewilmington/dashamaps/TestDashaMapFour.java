package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMapFour {
    @Test
    public void testSet() {
        DashaMap dashaMap = new DashaMapFour();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "ase\n" +
                "\tapples\t245\n" +
                "gel\n" +
                "\tgoogle\t345\n" +
                "lpm\n" +
                "\tlamp\t23\n" +
                "ama\n" +
                "\tanagram\t33\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        DashaMap dashaMap = new DashaMapFour();
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
        DashaMap dashaMap = new DashaMapFour();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        DashaMap dashaMap = new DashaMapFour();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void testBucketSize1() {
        DashaMap dashaMap = new DashaMapFour();
        dashaMap.set("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("ama"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMapFour();
        Assert.assertFalse(dashaMap.bucketSize("ana"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMapFour();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "ase\n" +
                "\tapples\t245\n" +
                "gel\n" +
                "\tgoogle\t345\n" +
                "lpm\n" +
                "\tlamp\t23\n" +
                "ama\n" +
                "\tanagram\t33\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMapFour();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("ase");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMapFour();
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
                "mfl\n" +
                "\tmyself\t4\n" +
                "we\n" +
                "\twe\t7\n" +
                "oru\n" +
                "\tour\t8\n" +
                "osr\n" +
                "\tours\t12\n" +
                "ose\n" +
                "\tourselves\t8\n" +
                "yuo\n" +
                "\tyou\t3\n" +
                "yru\n" +
                "\tyour\t4\n" +
                "ysr\n" +
                "\tyours\t5\n" +
                "yfl\n" +
                "\tyourself\t8\n" +
                "yse\n" +
                "\tyourselves\t0\n" +
                "he\n" +
                "\the\t2\n" +
                "hmi\n" +
                "\thim\t3\n" +
                "hsi\n" +
                "\this\t4\n" +
                "hfl\n" +
                "\thimself\t5\n" +
                "\therself\t9\n" +
                "seh\n" +
                "\tshe\t6\n" +
                "hre\n" +
                "\ther\t7\n" +
                "hsr\n" +
                "\thers\t8\n" +
                "it\n" +
                "\tit\t0\n" +
                "ist\n" +
                "\tits\t3\n" +
                "ifl\n" +
                "\titself\t6\n" +
                "tye\n" +
                "\tthey\t4\n" +
                "tme\n" +
                "\tthem\t4\n" +
                "tri\n" +
                "\ttheir\t5\n" +
                "tsr\n" +
                "\ttheirs\t6\n" +
                "tse\n" +
                "\tthemselves\t123\n" +
                "wta\n" +
                "\twhat\t574987\n" +
                "whc\n" +
                "\twhich\t34\n" +
                "woh\n" +
                "\twho\t56\n" +
                "wmo\n" +
                "\twhom\t87\n" +
                "tsi\n" +
                "\tthis\t5\n" +
                "tta\n" +
                "\tthat\t7\n" +
                "tes\n" +
                "\tthese\t9\n" +
                "\tthose\t7\n" +
                "am\n" +
                "\tam\t7\n" +
                "is\n" +
                "\tis\t8\n" +
                "aer\n" +
                "\tare\t9\n" +
                "wsa\n" +
                "\twas\t6\n" +
                "wer\n" +
                "\twere\t7\n" +
                "\twhere\t8\n" +
                "be\n" +
                "\tbe\t8\n" +
                "bne\n" +
                "\tbeen\t9\n" +
                "\tbetween\t123\n" +
                "bgn\n" +
                "\tbeing\t13\n" +
                "hev\n" +
                "\thave\t4\n" +
                "hsa\n" +
                "\thas\t6\n" +
                "hda\n" +
                "\thad\t7\n" +
                "hgn\n" +
                "\thaving\t88\n" +
                "do\n" +
                "\tdo\t2\n" +
                "dse\n" +
                "\tdoes\t4\n" +
                "ddi\n" +
                "\tdid\t5\n" +
                "dgn\n" +
                "\tdoing\t6\n" +
                "\tduring\t7\n" +
                "aa\n" +
                "\ta\t7\n" +
                "an\n" +
                "\tan\t77\n" +
                "teh\n" +
                "\tthe\t8\n" +
                "adn\n" +
                "\tand\t9\n" +
                "btu\n" +
                "\tbut\t23\n" +
                "if\n" +
                "\tif\t5\n" +
                "or\n" +
                "\tor\t6\n" +
                "bes\n" +
                "\tbecause\t77\n" +
                "as\n" +
                "\tas\t98\n" +
                "uli\n" +
                "\tuntil\t7\n" +
                "wel\n" +
                "\twhile\t8\n" +
                "of\n" +
                "\tof\t9\n" +
                "at\n" +
                "\tat\t0\n" +
                "by\n" +
                "\tby\t6\n" +
                "fro\n" +
                "\tfor\t7\n" +
                "wht\n" +
                "\twith\t8\n" +
                "atu\n" +
                "\tabout\t99\n" +
                "ats\n" +
                "\tagainst\t0\n" +
                "iot\n" +
                "\tinto\t6\n" +
                "thg\n" +
                "\tthrough\t6\n" +
                "ber\n" +
                "\tbefore\t2\n" +
                "are\n" +
                "\tafter\t6\n" +
                "aev\n" +
                "\tabove\t56\n" +
                "bwo\n" +
                "\tbelow\t7\n" +
                "to\n" +
                "\tto\t8\n" +
                "fmo\n" +
                "\tfrom\t45\n" +
                "up\n" +
                "\tup\t8\n" +
                "dnw\n" +
                "\tdown\t34\n" +
                "in\n" +
                "\tin\t76\n" +
                "otu\n" +
                "\tout\t88\n" +
                "on\n" +
                "\ton\t98\n" +
                "off\n" +
                "\toff\t5\n" +
                "ore\n" +
                "\tover\t34\n" +
                "\tother\t9\n" +
                "ure\n" +
                "\tunder\t6\n" +
                "ani\n" +
                "\tagain\t7\n" +
                "fre\n" +
                "\tfurther\t77\n" +
                "tne\n" +
                "\tthen\t12\n" +
                "oec\n" +
                "\tonce\t54\n" +
                "her\n" +
                "\there\t54\n" +
                "ter\n" +
                "\tthere\t23\n" +
                "wne\n" +
                "\twhen\t6\n" +
                "wyh\n" +
                "\twhy\t7\n" +
                "hwo\n" +
                "\thow\t8\n" +
                "all\n" +
                "\tall\t9\n" +
                "ayn\n" +
                "\tany\t2\n" +
                "bht\n" +
                "\tboth\t34\n" +
                "ehc\n" +
                "\teach\t6\n" +
                "fwe\n" +
                "\tfew\t12\n" +
                "mer\n" +
                "\tmore\t65\n" +
                "mts\n" +
                "\tmost\t72\n" +
                "sem\n" +
                "\tsome\t12\n" +
                "\tsame\t77\n" +
                "shc\n" +
                "\tsuch\t54\n" +
                "no\n" +
                "\tno\t23\n" +
                "nro\n" +
                "\tnor\t123\n" +
                "nto\n" +
                "\tnot\t65\n" +
                "oyl\n" +
                "\tonly\t23\n" +
                "onw\n" +
                "\town\t76\n" +
                "so\n" +
                "\tso\t12\n" +
                "tna\n" +
                "\tthan\t23\n" +
                "too\n" +
                "\ttoo\t87\n" +
                "vyr\n" +
                "\tvery\t54\n" +
                "cna\n" +
                "\tcan\t100\n" +
                "wll\n" +
                "\twill\t76\n" +
                "jts\n" +
                "\tjust\t12\n" +
                "sdl\n" +
                "\tshould\t6\n" +
                "nwo\n" +
                "\tnow\t5\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete1() {
        DashaMap dashaMap = getMap();
        dashaMap.delete("yourself");
        Assert.assertNull(dashaMap.get("yourself"));
    }

    @Test
    public void testDelete2() {
        DashaMapFour dashaMap = getMap();
        String actual = dashaMap.delete("gibberish");
        String expected = "deletion failed: item gibberish not found";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDelete3() {
        DashaMapFour dashaMap = getMap();
        dashaMap.delete("just");
        Assert.assertNull(dashaMap.get("just"));
    }

    public DashaMapFour getMap() {
        DashaMapFour dashaMap = new DashaMapFour();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split(" +");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
