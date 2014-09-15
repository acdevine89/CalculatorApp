package com.example.CalculatorApp;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int userChoice;
    boolean quit = false;
    double numberA;
    double numberB;

    do {
        System.out.println("Calculator Menu: What would you like to do?");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Square Root");
        System.out.println("6 - Quit Program");
        System.out.println("Enter menu selection by typing number here: ");
        userChoice = user.nextInt();
        

    } while(!quit);

    }
}
