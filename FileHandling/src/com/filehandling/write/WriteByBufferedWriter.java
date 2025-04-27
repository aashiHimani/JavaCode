package com.filehandling.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByBufferedWriter {
    public static void main(String[] args) {
        String text = "Happy coding...";
        try {
            BufferedWriter f_writer = new BufferedWriter(new FileWriter("/Users/himani/Desktop/demo.docx"));
            f_writer.write(text);
            System.out.print(text);
            System.out.print("File is created successfully with the content.");
            f_writer.close();
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
