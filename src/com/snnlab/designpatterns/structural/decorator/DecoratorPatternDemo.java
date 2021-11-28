package com.snnlab.designpatterns.structural.decorator;

/**
 *
 * java io package (Stream,Input/Output Reader use decorator pattern)
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Default circle:");
        circle.draw();
        System.out.println("Red circle:");
        redCircle.draw();
    }
}
