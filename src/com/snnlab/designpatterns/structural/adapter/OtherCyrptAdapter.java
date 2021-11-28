package com.snnlab.designpatterns.structural.adapter;

public class OtherCyrptAdapter implements Crypt{


    private OtherCyrpt otherCyrpt;


   public  OtherCyrptAdapter(OtherCyrpt otherCyrpt){

        this.otherCyrpt = otherCyrpt;

    }

    @Override
    public void encyrpt(String text) {

        this.otherCyrpt.textToCode(text);

    }

    @Override
    public void decyrpt(String text) {

        this.otherCyrpt.codeToText(text);

    }
}
