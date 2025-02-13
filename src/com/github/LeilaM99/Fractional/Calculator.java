package com.github.LeilaM99.Fractional;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        Operation operation = new Operation();

        while (fraction1.getDenominator() != 0) {
            System.out.println("Addition: " + operation.add(fraction1, fraction2));
            System.out.println("Subtraction: " + operation.subtract(fraction1, fraction2));
            System.out.println("Multiplication: " + operation.multiply(fraction1, fraction2));
            System.out.println("Division: " + operation.divide(fraction1, fraction2));
            break;
        }
    }

}