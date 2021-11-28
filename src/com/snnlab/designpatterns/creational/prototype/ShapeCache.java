package com.snnlab.designpatterns.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();


    public static Shape getShape(String id){
            Shape cachedShape = shapeMap.get(id);
            return  (Shape) cachedShape.clone();
    }


    public static void loadCache(){

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangular rectangular = new Rectangular();
        rectangular.setId("2");
        shapeMap.put(rectangular.getId(),rectangular);

    }
}
