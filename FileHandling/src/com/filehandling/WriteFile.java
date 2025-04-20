package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("abc.txt");
            fileWriter.write("Hi, I am Himu");
            fileWriter.close();
            System.out.println("Written successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
