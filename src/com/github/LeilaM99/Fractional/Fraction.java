package com.github.LeilaM99.Fractional;

public class Fraction {

        private int numerator;
        private int denominator;


        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                System.out.println("Denominator Cant be zero");
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public String display() {
            return numerator + "/" + denominator;
        }

        public Fraction add(Fraction fractionToAdd) {
        int newNumerator = this.numerator * fractionToAdd.denominator + fractionToAdd.numerator * this.denominator;
        int newDenominator = this.denominator * fractionToAdd.denominator;
        return new Fraction(newNumerator, newDenominator);
        }


        public Fraction subtract(Fraction fractionToSubtract) {
        int newNumerator = this.numerator * fractionToSubtract.denominator - fractionToSubtract.numerator * this.denominator;
        int newDenominator = this.denominator * fractionToSubtract.denominator;
        return new Fraction(newNumerator, newDenominator);
         }


        public Fraction multiply(Fraction fractionToMultiply) {
        int newNumerator = this.numerator * fractionToMultiply.numerator;
        int newDenominator = this.denominator * fractionToMultiply.denominator;
        return new Fraction(newNumerator, newDenominator);
        }


        public Fraction divide(Fraction fractionToDivide) {
            while (fractionToDivide.numerator == 0) {
                System.out.println("It Cant be zero");
                break;
            }
                int newNumerator = this.numerator * fractionToDivide.denominator;
                int newDenominator = this.denominator * fractionToDivide.numerator;
                return new Fraction(newNumerator, newDenominator);

        }


        public int getNumerator () {
                return numerator;
            }

        public int getDenominator () {
                return denominator;
            }

}

