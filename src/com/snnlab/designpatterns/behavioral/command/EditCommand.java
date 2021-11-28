package com.snnlab.designpatterns.behavioral.command;

public class EditCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Edit command is executed");
    }
}
