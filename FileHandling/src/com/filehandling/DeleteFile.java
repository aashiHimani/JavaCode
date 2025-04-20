package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        if(file.delete()){
            System.out.println("deleted file is "+file.getName());
        }
        else {
            System.out.println("not delete");
        }

    }
}
