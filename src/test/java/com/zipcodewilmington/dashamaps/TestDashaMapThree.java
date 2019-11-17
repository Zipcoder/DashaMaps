package com.zipcodewilmington.dashamaps;

import org.junit.Assert;
import org.junit.Test;

public class TestDashaMapThree {
    @Test
    public void testAdd() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "0\ta\n" +
                "\tlamp\t23\n" +
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
                "\tanagram\t33\n" +
                "14\to\n" +
                "\tgoogle\t345\n" +
                "15\tp\n" +
                "\tapples\t245\n" +
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
        DashaMap dashaMap = new DashaMapThree();
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
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
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
        dashaMap.add("anagram", 33);
        Assert.assertTrue(dashaMap.bucketSize("n"));
    }

    @Test
    public void testBucketSize2() {
        DashaMap dashaMap = new DashaMapThree();
        Assert.assertFalse(dashaMap.bucketSize("a"));
    }

    @Test
    public void testToStringBrief() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        String actual = dashaMap.toStringBrief();
        String expected = "0\ta\n" +
                "\tlamp\t23\n" +
                "1\tn\n" +
                "\tanagram\t33\n" +
                "2\to\n" +
                "\tgoogle\t345\n" +
                "3\tp\n" +
                "\tapples\t245\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInBucket() {
        DashaMap dashaMap = new DashaMapThree();
        dashaMap.add("apples", 245);
        dashaMap.add("google", 345);
        dashaMap.add("lamp", 23);
        dashaMap.add("anagram", 33);
        Node<String, Integer> bucket = dashaMap.getBucket("p");
        Integer actual = dashaMap.findInBucket(bucket, "apples");
        Integer expected = 245;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        DashaMap dashaMap = new DashaMapThree();
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
                "\twas\t6\n" +
                "\thave\t4\n" +
                "\thas\t6\n" +
                "\thad\t7\n" +
                "\thaving\t88\n" +
                "\ta\t7\n" +
                "\teach\t6\n" +
                "\tsame\t77\n" +
                "\tcan\t100\n" +
                "1\tb\n" +
                "\tabout\t99\n" +
                "\tabove\t56\n" +
                "2\te\n" +
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
                "3\tf\n" +
                "\tif\t5\n" +
                "\tof\t9\n" +
                "\tafter\t6\n" +
                "\toff\t5\n" +
                "4\tg\n" +
                "\tagainst\t0\n" +
                "\tagain\t7\n" +
                "5\th\n" +
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
                "6\ti\n" +
                "\ti\t1\n" +
                "\thim\t3\n" +
                "\this\t4\n" +
                "\thimself\t5\n" +
                "\tdid\t5\n" +
                "\twith\t8\n" +
                "\twill\t76\n" +
                "7\tl\n" +
                "\tall\t9\n" +
                "8\tm\n" +
                "\tam\t7\n" +
                "9\tn\n" +
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
                "10\to\n" +
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
                "11\tp\n" +
                "\tup\t8\n" +
                "12\tr\n" +
                "\tare\t9\n" +
                "\tor\t6\n" +
                "\tfrom\t45\n" +
                "13\ts\n" +
                "\tis\t8\n" +
                "\tas\t98\n" +
                "14\tt\n" +
                "\tit\t0\n" +
                "\tits\t3\n" +
                "\titself\t6\n" +
                "\tat\t0\n" +
                "\tother\t9\n" +
                "15\tu\n" +
                "\tour\t8\n" +
                "\tours\t12\n" +
                "\tourselves\t8\n" +
                "\tbut\t23\n" +
                "\tduring\t7\n" +
                "\tout\t88\n" +
                "\tfurther\t77\n" +
                "\tsuch\t54\n" +
                "\tjust\t12\n" +
                "16\tv\n" +
                "\tover\t34\n" +
                "17\tw\n" +
                "\town\t76\n" +
                "18\ty\n" +
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
        DashaMap dashaMap = new DashaMapThree();
        String[] text = Reader.readFile().split("\n");
        for (String t : text) {
            String[] pair = t.split("[ ]+");
            dashaMap.set(pair[0], Integer.parseInt(pair[1]));
        }
        return dashaMap;
    }
}
