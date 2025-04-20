package com.filehandling.write;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByFileOutputStream {
    public static void main(String[] args) {
        String fileContent = "Happy coding..";
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("file.txt");
            byte[] strToBytes = fileContent.getBytes();
            outputStream.write(strToBytes);
            System.out.print("File is created successfully with the content.");
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException e) {
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}
