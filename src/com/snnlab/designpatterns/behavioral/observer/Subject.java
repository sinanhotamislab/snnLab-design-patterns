package com.snnlab.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }


    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
