package com.github.LeilaM99.Fractional;

public class Operation {
    int newNumerator;
    int newDenominator;



    public String display(int newNumerator, int newDenominator) {
        this.newNumerator = newNumerator;
        this.newDenominator = newDenominator;
        return newNumerator + "/" + newDenominator;
    }

    public String add(Fraction fraction1, Fraction fraction2) {
        newNumerator = fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator();
        newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        return display(newNumerator, newDenominator);
    }


    public String subtract(Fraction fraction1, Fraction fraction2) {
        newNumerator = fraction1.getNumerator() * fraction2.getDenominator() - fraction2.getNumerator() * fraction1.getDenominator();
        newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        return display(newNumerator, newDenominator);
    }




    public String multiply(Fraction fraction1, Fraction fraction2) {
        newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
        newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        return display(newNumerator, newDenominator);
    }


    public String divide(Fraction fraction1, Fraction fraction2) {
//            while (fraction1.getDenominator() == 0 && fraction2.getDenominator() == 0) {
//                System.out.println("Denominator Cant be zero");
//                break; // return bayad bashe k az method biyad biron . nemidonam chikar kardam
//            }
        newNumerator = fraction1.getNumerator() * fraction2.getDenominator();
        newDenominator = fraction1.getDenominator() * fraction2.getNumerator();
        return display(newNumerator, newDenominator);

    }
}
