package com.github.LeilaM99.Fractional;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    Fraction fraction1 = new Fraction(1, 2);
    Fraction fraction2 = new Fraction(3, 4);

    System.out.println("Addition: " + fraction1.add(fraction2));
    System.out.println("Subtraction: " + fraction1.subtract(fraction2));
    System.out.println("Multiplication: " + fraction1.multiply(fraction2));
    System.out.println("Division: " + fraction1.divide(fraction2));
}
}

