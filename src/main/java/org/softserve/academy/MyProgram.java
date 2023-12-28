package org.softserve.academy;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyProgram {
    public static void main(String [] args) {
        Set s = new HashSet();
        String [] words = {"Oksana", "World", "World", "home", "anchor", "Hi", "Wait", "Xx", "xYt"};
        for (int i = 0; i < words.length; i++) {
//            try {
//                if (!s.add(words[i])) System.out.println("Duplicate try catch detected: " + words[i]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){System.out.println("Duplicate detected: " + words[i]);}
           if (!s.add(words[i])) System.out.println("Duplicate detected: " + words[i]);
        }
        System.out.println(s.size() + " distinct words detected: " + s);
    }
}
