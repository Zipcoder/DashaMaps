package com.zipcodewilmington.dashamaps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reader {
    public static String readFile() {
        StringBuilder output = new StringBuilder();
        try {
            File file = new File("/Users/wes/dev/lab/week5/DashaMaps/word-list.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                output.append(st + "\n");
        } catch(Exception eee) {}
        return output.toString();
    }
}
