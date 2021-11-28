package com.snnlab.designpatterns.behavioral.observer;


/**
 *
 * one-to many relation between objects
 * one object is notified, the other objects are notified.
 *  Three main concept class includes -> Subject (Very important for notifing process), Observer, Client
 *
 */



public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}
