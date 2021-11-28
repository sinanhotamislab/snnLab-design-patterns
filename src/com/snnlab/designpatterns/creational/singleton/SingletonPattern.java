package com.snnlab.designpatterns.creational.singleton;

/**
 *
 *  Singleton design pattern provides create a single object, not instantieted any objects from class
 *
 */

public class SingletonPattern {

    public static void main(String[] args) {

        User user = User.getInstance();
        user.sayHello();

    }
}
