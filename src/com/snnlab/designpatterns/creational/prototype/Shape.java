package com.snnlab.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;


    abstract void draw();


    public Object clone(){

        Object clonedObject = null;
        try {
            clonedObject = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return clonedObject;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
