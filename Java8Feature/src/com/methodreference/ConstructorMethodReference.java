package com.methodreference;
import java.util.*;
import java.util.function.*;

// Object need to be sorted
class Person2 {
    private String name;
    private Integer age;
    public Person2(){
        Random ran = new Random();
        this.name=ran.ints(97, 122 + 1).limit(7)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
    public Integer getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class ConstructorMethodReference {
    public static <T> List<T> getObjectList(int length,Supplier<T> objectSupply) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }
    public static void main(String[] args) {
        List<Person2> personList = getObjectList(5, Person2::new);
        personList.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
