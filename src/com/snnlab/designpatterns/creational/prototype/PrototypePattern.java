package com.snnlab.designpatterns.creational.prototype;


/**
 *
 * Creational design pattern , to be used clone mechanism to reduce cost of create complex object
 *
 *
 */

public class PrototypePattern {


    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape circle =  ShapeCache.getShape("1");
        circle.draw();

        Shape rectangular =  ShapeCache.getShape("2");
        rectangular.draw();

    }

}
