package com.filehandling.delete;

import java.io.File;

public class DeleteByDeleteFunction {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\himani\\Desktop\\1.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}
