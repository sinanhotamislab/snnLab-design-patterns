package com.snnlab.designpatterns.structural.adapter;

public class CyrptA implements Crypt {

    @Override
    public void encyrpt(String text) {

        System.out.println(text+"A");

    }

    @Override
    public void decyrpt(String text) {

        System.out.println(text+"AA");

    }
}
