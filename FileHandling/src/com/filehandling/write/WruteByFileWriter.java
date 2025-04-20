package com.filehandling.write;

import java.io.FileWriter;
import java.io.IOException;

public class WruteByFileWriter {
    public static void main(String[] args) {
        String text = "Happy coding..";
        try {
            FileWriter fWriter = new FileWriter("/Users/himani/Desktop/demo.docx");
            fWriter.write(text);
            System.out.println(text);
            fWriter.close();
            System.out.println("File is created successfully with the content.");
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
