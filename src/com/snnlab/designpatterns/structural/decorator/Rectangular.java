package com.snnlab.designpatterns.structural.decorator;

public class Rectangular implements Shape{

    @Override
    public void draw() {
        System.out.println("I am rectangular..");
    }
}
