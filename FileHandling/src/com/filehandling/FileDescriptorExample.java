package com.filehandling;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorExample {
    public static void main(String[] args) throws IOException {
        FileDescriptor descriptor = null;
        FileOutputStream outputStream = null;
        byte[] buffer = {71,69,69,75,83};
        try{
            outputStream = new FileOutputStream("FILE.txt");
            descriptor = outputStream.getFD();
            outputStream.write(buffer);
            descriptor.sync();
            System.out.print("\nUse of Sync Successful ");
        }
        catch(Exception except) {
            except.printStackTrace();
        }
        finally {
            if(outputStream!=null)
                outputStream.close();
        }

        //valid
        FileDescriptor descriptor1 = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("FILE.txt");
            descriptor1 = inputStream.getFD();
            boolean check = false;
            check = descriptor1.valid();
            System.out.print("FileDescriptor is valid : "+check);
        }
        catch(Exception except) {
            except.printStackTrace();
        }
        finally {
            if(inputStream!=null)
                inputStream.close();
        }
    }
}
