package com.snnlab.designpatterns.structural.facade;

public class Rectangular extends Shape {


    @Override
    void draw() {
        System.out.println("Drawing Rectangular");
    }


    public Rectangular(){
        this.type = "Rectangular";
    }
}
