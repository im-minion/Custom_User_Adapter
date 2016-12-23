package com.example.vaibhav.hello;

/**
 * Created by vaibhav on 22/12/16.
 */
import java.util.ArrayList;
public class User {
    public String name;
    public String hometown;
    public User(String name,String hometown){
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<User> getUser(){
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0;i<150;i++) {
            users.add(new User("abc"+i, "london"));
            users.add(new User("vpm"+i, "pune"));
            users.add(new User("vbs"+i, "mumbai"));
        }
        return users;
    }
}
