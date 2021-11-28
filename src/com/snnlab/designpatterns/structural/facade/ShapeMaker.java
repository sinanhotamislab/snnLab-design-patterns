package com.snnlab.designpatterns.structural.facade;

public class ShapeMaker {

    private Circle circle;
    private Rectangular rectangular;


    public ShapeMaker() {
        circle = new Circle();
        rectangular = new Rectangular();
    }


    public void drawCircle() {
        this.circle.draw();
    }


    public void drawRectangular() {
        this.rectangular.draw();
    }
}
