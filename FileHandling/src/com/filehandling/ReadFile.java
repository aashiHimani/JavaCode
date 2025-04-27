package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File file=new File("abc.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String data=scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
