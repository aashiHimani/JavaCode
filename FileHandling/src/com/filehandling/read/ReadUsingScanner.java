package com.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\himani\\Desktop\\test.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

        //without using loop
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
