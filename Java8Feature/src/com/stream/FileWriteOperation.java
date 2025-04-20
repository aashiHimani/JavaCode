package com.stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWriteOperation {
    public static void main(String[] args)
    {
        String[] words={"Himu","Somu","Chimpu","Hello","World" };
        String fileName = "path/to/your/file.txt";
        try (PrintWriter pw=new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
            Stream.of(words).forEach(pw::println);
            System.out.println("Words written to the file successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
