package com.snnlab.designpatterns.creational.singleton;

public class User {


    //make the constructor private so that this class cannot be instantiated
    private User(){}

    private static User instance = new User();

    public static User getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
