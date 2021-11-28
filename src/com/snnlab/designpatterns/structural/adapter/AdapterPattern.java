package com.snnlab.designpatterns.structural.adapter;


/**
 *
 * Structural design pattern provides two unsuitible interface usage
 *
 *
 */


public class AdapterPattern {


    public static void main(String[] args) {

        Crypt cryptA = new CyrptA();
        cryptA.encyrpt("Sinan");
        cryptA.encyrpt("Java");

        Crypt otherCrypt = new OtherCyrptAdapter(new OtherCyrpt());
        otherCrypt.encyrpt("Sinan");
        otherCrypt.decyrpt("Java");

    }






}
