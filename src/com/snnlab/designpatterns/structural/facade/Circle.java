package com.snnlab.designpatterns.structural.facade;

public class Circle extends Shape {


    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }


    public Circle(){
        this.type = "Circle";
    }
}
