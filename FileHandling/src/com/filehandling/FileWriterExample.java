package com.filehandling;

import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileWriterExample {
    public static void main(String[] args) {
        String file = "output.txt";
        try {
            FileWriter o1 = new FileWriter(file);
            FileWriter o2 = new FileWriter(file, Charset.forName("UTF11"));
            System.out.println("Character encoding of o1: " + o1.getEncoding());
            System.out.println("Character encoding of o2: " + o2.getEncoding());
            o1.close();
            o2.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
