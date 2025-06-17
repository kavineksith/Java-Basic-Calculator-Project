package org.example;

public class Main {

    public int add(int a , int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        // If both of a and b are zero, return 0.0
        if (a == 0 && b == 0) {
            return 0.0;
        }
        // Check if only b is zero (division by zero)
        else if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        // Regular division
        else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {

        System.out.println("Calculator Application");
        Main calculator = new Main(); // Create an instance of Main to access its methods
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        try { // Try block to handle division by zero
            System.out.println("Division: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) { // Catch division by zero
            System.out.println(e.getMessage());
        }
    }
}