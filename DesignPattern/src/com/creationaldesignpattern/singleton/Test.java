package com.creationaldesignpattern.singleton;

import java.io.Serializable;

public class Test implements Serializable, Cloneable {
    private static Test obj;
    private Test(){
//        if(obj!=null){
//            throw new RuntimeException("trying to break singletion");
//        }
    }
    public static Test getTest(){
        if(obj==null){
            obj=new Test();
        }
        return obj;
    }
    public Object readResolve(){
        return obj;
    }
    public Object clone() throws CloneNotSupportedException {
       // return super.clone();
        return obj;
    }
}
