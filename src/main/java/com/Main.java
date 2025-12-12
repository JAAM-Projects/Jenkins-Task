package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printf("welcome! \n");
        int choice;
        System.out.println("Choose:\n 1 for summation\n 2 for subtraction\n 3 for multiplication\n 4 for division ");
        while (true)
        {
            System.out.println("Please enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println(calculator.add(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println(calculator.sub(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println(calculator.mul(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println(calculator.div(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Please choose a valid choice ");
                    break;
            }
            System.out.println("Try again? (y/n)");
            String answer = scanner.next();
            if(answer.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}