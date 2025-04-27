package com.filehandling.write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteByWriteString {
    public static void main(String[] args) {
        String text = "Happy Coding..";
        Path fileName = Path.of("/Users/himani/Desktop/demo.docx");
        try {
            Files.writeString(fileName, text);
            String fileContent = Files.readString(fileName);
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
