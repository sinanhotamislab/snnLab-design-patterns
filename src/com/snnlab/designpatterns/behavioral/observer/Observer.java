package com.snnlab.designpatterns.behavioral.observer;

public abstract class Observer {

    protected Subject subject;
    protected abstract void update();
}
