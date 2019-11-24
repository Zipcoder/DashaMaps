
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Assert;
    import org.junit.Test;

    import java.io.*;
    import java.util.Scanner;

    public class TestAll {

        private DashaMapOne d1;
        private DashaMapTwo d2;
        private DashaMapThree d3;

        @Before
        public void setUp(){
            d1 = new DashaMapOne();
            d2 = new DashaMapTwo();
            d3 = new DashaMapThree();
            setMaps();
        }

        private void setMaps() {
            String file = "word-list.txt";
            try {
                Scanner scanner = new Scanner(new File(file));
                while (scanner.hasNext()) {
                    String[] currentLine = scanner.nextLine().split(" ");

                    d1.set(currentLine[0], currentLine[1]);
                    d2.set(currentLine[0], currentLine[1]);
                    d3.set(currentLine[0], currentLine[1]);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }


        @Test
        public void testSizes(){
            long expected = 124;

            Assert.assertEquals(expected, d1.size());
            Assert.assertEquals(expected, d2.size());
            Assert.assertEquals(expected, d3.size());
        }

        @Test
        public void testGet(){
            Integer expected = 34;

            Assert.assertEquals(expected, d1.get("both"));
            Assert.assertEquals(expected, d2.get("both"));
            Assert.assertEquals(expected, d3.get("both"));
        }

        @Test
        public void testDelete(){
            long expected = 123;

            d1.delete("both");
            d2.delete("both");
            d3.delete("both");

            Assert.assertEquals(expected, d1.size());
            Assert.assertEquals(expected, d2.size());
            Assert.assertEquals(expected, d3.size());
        }

    }
}
