package com.snnlab.designpatterns.behavioral.command;

public class Context {

    private Command command;

    public Context(Command command){
        this.command = command;
    }

    public void executeCommand(){
        this.command.execute();
    }
}
