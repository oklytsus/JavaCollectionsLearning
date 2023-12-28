package org.softserve.academy;

class Helper {
    private static String message;

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}

public class Runner {
    public static void main(String[] args) {
        Helper.setMessage("hello");
        Helper.print();
        // Not recommended
        Helper helper = new Helper();
        helper.setMessage("new message");
        helper.print();
    }
}
