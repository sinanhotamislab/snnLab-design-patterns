package com.snnlab.designpatterns.behavioral.mediator;

/**
 *
 * Chatroom is mediator class that provides to communication with other objects.
 *
 */


public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(user.getName() + " is send message: " + message);
    }
}
