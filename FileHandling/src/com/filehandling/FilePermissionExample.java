package com.filehandling;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionExample {
    public static void main(String[] args) {
        //equal-whether two(checks FP_obj pathname & filename with this object) FilePermission objects are equal or not
        boolean bool = false;
        FilePermission FP_obj1 = new FilePermission("XYZ", "read");
        FilePermission FP_obj2 = new FilePermission("ABC", "write");
        FilePermission FP_obj3 = new FilePermission("XYZ", "read");
        bool = FP_obj2.equals(FP_obj1);
        System.out.println("Whether FP_obj1 equals FP_obj2 : " + bool);
        bool = FP_obj2.equals(FP_obj3);
        System.out.println("Whether FP_obj2 equals FP_obj2 : " + bool);
        bool = FP_obj1.equals(FP_obj3);
        System.out.println("Whether FP_obj3 equals FP_obj1 : " + bool);

        //getActions-tells action of this FilePermission Object.
        FilePermission FP_obj11 = new FilePermission("GEEKS", "read, delete, write");
        FilePermission FP_obj22 = new FilePermission("ABC", "write, read, execute");
        FilePermission FP_obj33 = new FilePermission("GEEKS", "delete, readlink, read");
        String str = FP_obj11.getActions();
        System.out.println("Actions with FP_obj11 : " + str);
        str = FP_obj22.getActions();
        System.out.println("Actions with FP_obj22 : " + str);
        str = FP_obj33.getActions();
        System.out.println("Actions with FP_obj33 : " + str);

        //hashcode
        int i = FP_obj11.hashCode();
        System.out.println("hashCode value for FP_obj11 : " + i);

        //implies-whether this FilePermision has argumented Permission or not.
        boolean check = FP_obj1.implies(FP_obj2);
        System.out.println("Using implies() for FP_obj1 : " + check);
        check = FP_obj2.implies(FP_obj2);
        System.out.println("Using implies() for FP_obj2 : " + check);

        //newPermissionCollection-creates PermissionCollection object having FilePermission objects
        PermissionCollection FP = FP_obj1.newPermissionCollection();
        FP.add(FP_obj1);
        boolean check1 = FP.implies(new FilePermission("XYZ.txt", "read"));
        System.out.println("Is newPermissionCollection() working : " + check1);
    }
}
