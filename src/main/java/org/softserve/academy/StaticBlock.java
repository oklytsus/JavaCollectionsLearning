package org.softserve.academy;


public class StaticBlock {
    static String str = "Hello Java!";

    static {
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("Hello from the method 'main'");
    }
}


