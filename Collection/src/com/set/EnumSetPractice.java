package com.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

enum Enumsetpractice {HI, HELLO, BYE};
enum FLOWER {ROSE, TULIP, SUNFLOWER};
enum NUMBER {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT};
public class EnumSetPractice {
    public static void main(String[] args) {
        EnumSet<Enumsetpractice> set;
        set= EnumSet.of(Enumsetpractice.HI,Enumsetpractice.HELLO, Enumsetpractice.BYE );
        System.out.println(set);

        //allOf
        EnumSet<FLOWER> eset=null;
        System.out.println(eset);
        eset=EnumSet.allOf(FLOWER.class);
        System.out.println("updated set:"+eset);

        //clone
        EnumSet<FLOWER> cset=eset.clone();
        System.out.println("clone set:"+cset);

        //complementOf
        EnumSet<FLOWER> comset=EnumSet.of(FLOWER.TULIP);
        System.out.println("inital set:"+comset);
        EnumSet<FLOWER> fset=EnumSet.complementOf(comset);
        System.out.println("complement set:"+fset);

        //copyOf(Collection collect)
        Collection<FLOWER> col=new ArrayList<>();
        col.add(FLOWER.TULIP);
        System.out.println("collection is:"+col);
        EnumSet<FLOWER> qset=EnumSet.copyOf(col);
        System.out.println("copy of collection set:"+qset);
        //copyOf(EnumSet e_set)

        //noneOf(Class elementType) method in Java is used to create a null set of the type elementType
        EnumSet<FLOWER> enumSet=EnumSet.noneOf(FLOWER.class);
        System.out.println("none set :"+enumSet);

        //range(E start_point, E end_point)
        EnumSet<NUMBER> numberEnumSet;
        numberEnumSet=EnumSet.range(NUMBER.THREE,NUMBER.SEVEN);
        System.out.println("range of set :"+numberEnumSet);

        //
    }
}
