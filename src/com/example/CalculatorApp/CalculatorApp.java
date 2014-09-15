package com.example.CalculatorApp;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int userChoice;
    boolean quit = false;
    double numberA, numberB, sumAB, subtractAB, multiplyAB;

    do {
        System.out.println("Calculator Menu: What would you like to do?");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Square Root");
        System.out.println("6 - Quit Program");
        System.out.print("Enter menu selection by typing number here: ");
        userChoice = user.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println();
                System.out.print("Give me the first number: ");
                numberA = user.nextDouble();

                System.out.println();
                System.out.print("Give me the second number: ");
                numberB = user.nextDouble();

                sumAB = numberA + numberB;
                System.out.println("The sum of " + numberA + " and " + numberB + " is " + sumAB);
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.print("Give me the number to be subtracted from: ");
                numberA = user.nextDouble();

                System.out.println();
                System.out.print("Give me the number to subtract: ");
                numberB = user.nextDouble();

                subtractAB = numberA - numberB;
                System.out.println("The difference between " + numberA + " and " + numberB + " is " + subtractAB);
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.print("Give me the first number: ");
                numberA = user.nextDouble();

                System.out.println();
                System.out.print("Give me the second number: ");
                numberB = user.nextDouble();

                multiplyAB = numberA * numberB;
                System.out.println("The product of " + numberA + " and " + numberB + " is " + multiplyAB);
                System.out.println();
                break;

        }

        System.out.print("Would you like to do another calculation? Type 1 for yes, 2 for no: ");

    } while(!quit);

    }
}
