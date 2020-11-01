package se.lexicon.Samuel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //create instance of app
        App a = new App();
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, selection; //you do not need to repeat int for each type of var to be added
        boolean check = true;

        //for the operator to be used - selection

        while (check) {
            System.out.println("what do you want to compute? Make your selection.");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 - Terminate calculator");
            selection = scan.nextInt(); //this helps take back the input for the selection
            if (selection < 5) {
                System.out.println("Enter any 2 numbers...");
                //this is used to receive input from
                System.out.println("first number:");
                num1 = scan.nextInt();
                System.out.println("second number:");
                num2 = scan.nextInt();
                if (selection == 1) {
                    num3 = a.addition(num1, num2);
                    System.out.println("Your answer is " + num3);
                } else if (selection == 2) {
                    num3 = a.subtraction(num1, num2);
                    System.out.println("Your answer is " + num3);
                } else if (selection == 3) {
                    num3 = a.multiplication(num1, num2);
                    System.out.println("Your answer is " + num3);
                } else if (selection == 4) {
                    num3 = a.division(num1, num2);
                    System.out.println("Your answer is " + num3);
                }
                System.out.println("what you wanna do next ");

            } else if (selection == 5) {
                System.out.println("calculator terminated ");
                check = false; //this turns the boolean back to false and code execution stops

            } else {
                System.out.println("please pick within the available options");
            }
        }
    }

    public int addition(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public int subtraction(int a, int b) {
        int c;
        c = a - b;
        return c;
    }
    public int multiplication(int a, int b) {
        int c;
        c = a * b;
        return c;
    }
    public int division(int a, int b) {
        int c;
        c = a / b;
        return c;
    }
}
