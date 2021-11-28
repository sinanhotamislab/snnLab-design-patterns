package com.snnlab.designpatterns.behavioral.mediator;

public class MediatorPatternDemo {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Sinan");
        user.sendMessage("I am trying Mediator Design Pattern");
    }
}
