package com.snnlab.designpatterns.behavioral.nullobject;

public class RealCustomer extends Customer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public Boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
