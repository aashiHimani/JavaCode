package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class User{
    private int userId;
    private String name;
    private String city;

    public int getUserId() {
        return userId;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public User(int userId, String name, String city) {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class StreamToMap {
    public static void main(String[] args) {
        String str="Hi Somu";
        Map<String, Integer> map= Arrays.stream(str.split(" ")).collect(Collectors.toMap(v->v,v->v.length()));
        System.out.println(map);

        User user1=new User(1,"User1","Puri");
        User user2=new User(2,"User2","Blr");
        Map<Integer,User> userMap=Arrays.asList(user1,user2).stream().collect(Collectors.toMap(u->u.getUserId(),u->u));
        System.out.println(userMap);
        Map<String, List<User>> userMap1=Arrays.asList(user1,user2).stream().collect(Collectors.groupingBy(User::getCity));
        System.out.println(userMap1);
        Map<String, Long> userMap2=Arrays.asList(user1,user2).stream().collect(Collectors.groupingBy(User::getCity,Collectors.counting()));
        System.out.println(userMap2);
    }
}
