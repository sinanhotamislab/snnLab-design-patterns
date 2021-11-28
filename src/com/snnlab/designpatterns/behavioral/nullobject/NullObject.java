package com.snnlab.designpatterns.behavioral.nullobject;


/**
 *
 *
 * Behavioral Design Pattern -> to be represnet null object instead of  null reference.
 *
 *
 *
 *
 */

public class NullObject {


    public static void main(String[] args) {


        Customer realCustomer = new RealCustomer("Sinan");
        Customer nullCustomer = new NullCustomer();

        System.out.println("IsNil:"+realCustomer.isNil()+realCustomer.getName());
        System.out.println("IsNil:"+nullCustomer.isNil()+nullCustomer.getName());

    }
}
