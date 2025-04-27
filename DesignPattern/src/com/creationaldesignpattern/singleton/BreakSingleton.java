package com.creationaldesignpattern.singleton;

public class BreakSingleton {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {
        //reftection api
        //solution if object is there-throw exception from inside constructor
        /*
        Test t1=Test.getTest();
        System.out.println(t1.hashCode());

        Constructor<Test> constructor=Test.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Test t2=constructor.newInstance();
        System.out.println(t2.hashCode());
         */

        //use enum
        /*
        Test2 t3=Test2.INSTANCE;
        System.out.println(t3.hashCode());

        Constructor<Test2> constructor1=Test2.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Test2 t4=constructor1.newInstance();
        System.out.println(t4.hashCode());
         */

        //deserilization
        //solution implement readResolve method
        /*
        Test test=Test.getTest();
        System.out.println(test.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream((new FileOutputStream("abc.ob")));
        oos.writeObject(test);
        System.out.println("serilization done...");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        Test test1=(Test)ois.readObject();
        System.out.println(test1.hashCode());
         */

        //clone
        Test test0=Test.getTest();
        System.out.println(test0.hashCode());
        Test test1=(Test) test0.clone();
        System.out.println(test1.hashCode());

    }

}
