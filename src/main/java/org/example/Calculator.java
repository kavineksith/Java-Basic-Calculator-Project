package org.example;

import java.util.Scanner;

public class Calculator {
    /**
     * This is a simple calculator program that takes two double values as input,
     * adds them together, and prints the total as an integer.
     */

    public static double[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Value: ");
        double firstValue = Double.parseDouble(scanner.next());
        System.out.println("Second Value: ");
        double secondValue = Double.parseDouble(scanner.next());

        scanner.close();

        return new double[]{firstValue, secondValue};
    }

    public static double add(double f_number, double l_number) {
        return f_number + l_number;
    }

    public static double subtract(double f_number, double l_number) {
        return f_number - l_number;
    }

    public static double multiply(double f_number, double l_number) {
        return f_number * l_number;
    }

    public static double division(double f_number, double l_number) {
        if (l_number == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            throw new ArithmeticException("Division by zero");
        } else {
            return f_number / l_number;
        }
    }

    public static double userChoice(String operation) {
        double[] numbers = inputNumbers();
        double firstNumber = numbers[0];
        double secondNumber = numbers[1];

        switch (operation.toLowerCase()) {
            case "add":
                return add(firstNumber, secondNumber);
            case "subtract":
                return subtract(firstNumber, secondNumber);
            case "multiply":
                return multiply(firstNumber, secondNumber);
            case "divide":
                return division(firstNumber, secondNumber);
            default:
                System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result = userChoice(operation);
        System.out.println("Result: " + (int) result); // Cast to int for the final output

        scanner.close();
    }
}
