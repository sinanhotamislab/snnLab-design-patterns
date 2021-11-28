package com.snnlab.designpatterns.behavioral.nullobject;

public class NullCustomer extends Customer{


    @Override
    public Boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Avilable Customer";
    }
}
