package org.softserve.academy;

import java.util.Scanner;

/**
 * Write a Java console application with methods that accept two numbers as arguments and have the following names:
 * <p>
 * getTotal - returns their sum;
 * getAverage - returns their average;
 * (*) static getNumber(String prompt) - allows input of numbers using Scanner with messages and return number
 * Call these methods from the main() method and print the results.
 */
public class Task1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double number1;
        double number2;
        number1 = getNumber("Enter the first number: ");
        number2 = getNumber("Enter the second number: ");
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", number1, number2, getTotal(number1, number2));
        System.out.printf("The average of %.2f and %.2f is %.2f\n", number1, number2, getAverage(number1, number2));
    }

    public static double getNumber(String promt) {
        System.out.println(promt);
        return sc.nextDouble();
    }

    static double getTotal(double n1, double n2) {
        return n1 + n2;
    }
    static double getAverage(double n1, double n2){
        return (n1+n2)/2;
    }
}
