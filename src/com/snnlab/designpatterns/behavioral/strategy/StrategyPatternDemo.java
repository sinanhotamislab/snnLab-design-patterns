package com.snnlab.designpatterns.behavioral.strategy;

/**
 *
 *   Class behaviour can be changed on run time.
 *
 *
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("Operation Add Strategy:" + context.executeStrategy(12,25));

        context = new Context(new OperationSubtract());
        System.out.println("Operation Subtract Strategy:" + context.executeStrategy(30,25));

    }
}
