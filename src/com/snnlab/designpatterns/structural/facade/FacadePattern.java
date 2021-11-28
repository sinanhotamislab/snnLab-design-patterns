package com.snnlab.designpatterns.structural.facade;


/**
 *
 *
 * Structıral Design Pattern -> To be hide existince system complexity by facade class.
 *
 *
 *
 */
public class FacadePattern {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangular();

    }
}
