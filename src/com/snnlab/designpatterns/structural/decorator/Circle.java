package com.snnlab.designpatterns.structural.decorator;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("I am circle..");
    }
}
