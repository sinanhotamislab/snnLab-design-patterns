package com.snnlab.designpatterns.structural.decorator;

public  class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {

        System.out.println("Shape color is red..");
    }
}
