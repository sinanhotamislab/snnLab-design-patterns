package com.snnlab.designpatterns.behavioral.command;

public class SaveCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Save command is executed");
    }
}
