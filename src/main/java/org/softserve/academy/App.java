package org.softserve.academy;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        String[] words = {"Oksana", "World", "java", "home", "anchor", "Hi", "Wait", "Xx", "xYt"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        int[] numbers = {3, 5, 6, 12, 0};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Position of element 5 is: " + index);
        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        double avarage;
        for (int number : numbers) sum += number;
        avarage = sum / numbers.length;
        System.out.println("The avarage of arrays numbers is: " + avarage);
        System.out.println("Enter word to search:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        index = Arrays.binarySearch(words, word);
        System.out.println("Position of element " + word + " is: " + index);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        App myObj = new App(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object


    }
}
