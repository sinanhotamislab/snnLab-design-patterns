package com.snnlab.designpatterns.creational.prototype;

public class Rectangular extends Shape {


    @Override
    void draw() {
        System.out.println("Drawing Rectangular");
    }


    public Rectangular(){
        this.type = "Rectangular";
    }
}
