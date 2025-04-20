package com.filehandling.read;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadUsingFileReader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\himani\\Desktop\\test.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    }
}
