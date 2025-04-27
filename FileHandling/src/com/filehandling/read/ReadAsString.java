package com.filehandling.read;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAsString {
    public static void main(String[] args) throws Exception {
        String data=readFileAsString("C:\\Users\\himani\\Desktop\\test.java");
        System.out.println(data);
    }
    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
