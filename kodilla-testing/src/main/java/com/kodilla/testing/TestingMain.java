package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Kolejne testy
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(4, 2);
        int subtractResult = calculator.subtract(4, 2);

        if(addResult==6 && subtractResult==2) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator error!");
        }
    }
}
