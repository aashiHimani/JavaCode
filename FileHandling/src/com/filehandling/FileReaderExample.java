package com.filehandling;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("abc.txt");
            System.out.println("Reading char by char : \n");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println("Reading using array : \n");
            char[] charArray = new char[10];
            fileReader.read(charArray);
            System.out.print(charArray);
            fileReader.close();
            System.out.println("FileReader closed!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
