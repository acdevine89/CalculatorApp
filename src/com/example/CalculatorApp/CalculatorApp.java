package com.example.CalculatorApp;
import java.util.Scanner;
import java.lang.Math;

public class CalculatorApp {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int userChoice, calculateAgain;
    double numberA, numberB, sumAB, subtractAB, multiplyAB, divideAB, squareRootA;

    do {
        System.out.println("Calculator Menu: What would you like to do?");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Square Root");
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
            case 4:
                System.out.println();
                System.out.print("Give me the number to be divided: ");
                numberA = user.nextDouble();

                System.out.println();
                System.out.print("Give me the number to divide by: ");
                numberB = user.nextDouble();

                divideAB = numberA / numberB;
                System.out.println("The quotient of " + numberA + " and " + numberB + " is " + divideAB);
                System.out.println();
                break;
            case 5:
                System.out.println();
                System.out.print("Give me the number to find the square root of: ");
                numberA = user.nextInt();

                squareRootA = Math.sqrt(numberA);
                System.out.println("The square root of " + numberA + " is " + squareRootA);

                while (numberA < 0) {
                    System.out.print("Can't find square root of a negative number. Please enter a positive  number: ");
                    numberA = user.nextInt();
                    if (numberA >= 0) {
                        squareRootA = Math.sqrt(numberA);
                        System.out.println("The square root of " + numberA + " is " + squareRootA);
                    }
                }

                System.out.println();
                break;
            default:
                System.out.println();
                System.out.print("Invalid choice. The only options are 1, 2, 3, 4 or 5.");
                System.out.println();
                break;

        }

        System.out.print("Would you like to continue? Type 1 to go back to main menu, or type 2 to quit: ");
        calculateAgain = user.nextInt();

        while (calculateAgain !=1 && calculateAgain != 2) {
            System.out.print("Invalid choice. Please type 1 or 2: ");
            calculateAgain = user.nextInt();
        }

    } while(calculateAgain == 1);

        System.out.println("Goodbye!");

    }
}
