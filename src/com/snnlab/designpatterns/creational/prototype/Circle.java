package com.snnlab.designpatterns.creational.prototype;

public class Circle extends Shape {


    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }


    public Circle(){
        this.type = "Circle";
    }
}
