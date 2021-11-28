package com.snnlab.designpatterns.behavioral.command;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * Command manage single operation on different command, Strategy manages many operation on different strategy.
 *
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

         Context context = new Context(new SaveCommand());
         context.executeCommand();

         context = new Context(new EditCommand());
         context.executeCommand();

         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(3);

        int result = 0;


        int leftSum = 0;
        int rightSum = 0;

        int balancePoint = list.size() - 2;
        boolean breakPoint = true;

        while(breakPoint) {

            for (int i = 0; i < balancePoint;i++) {
                leftSum += list.get(i);
            }
            for (int j = balancePoint; j <= list.size() - 2; j++) {
                rightSum += list.get(j+1);
            }

            System.out.println("Left Sum:"+ leftSum+ "Right Sum:" + rightSum + "Pivot:"+ result);

            if (leftSum == rightSum || balancePoint == 0) {
                result = balancePoint;
                breakPoint = false;
            } else {
                leftSum = 0;
                rightSum = 0;
                balancePoint--;
            }

        }

        System.out.println(result);


    }
}
