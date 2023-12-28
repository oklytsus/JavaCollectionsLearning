package org.softserve.academy;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> addList = List.of("add First", "add Second");
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        list.add(0, "One more first element");
        list.addAll(2, addList);
        for (String object : list) {    System.out.println (object);     }


    }
}
