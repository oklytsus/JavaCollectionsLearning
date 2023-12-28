package org.softserve.academy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollectionClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        Collections.reverse(list);
        System.out.println("reverse: " +list);
        System.out.println(Collections.frequency(list, "first"));
        // sorting
        Collections.sort(list);
        System.out.println("sort: "+list);
        // uses a binary search algorithm to find a specific element;
        //returns the element number or a negative number
        System.out.println(Collections.binarySearch(list, "third"));

        //reverse sort order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sort reverse"+ list);
        System.out.println(Collections.binarySearch(list, "second", Collections.reverseOrder()));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("shuffle: "+ list);
        // max value, min value,
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // cyclically shifts the elements passed to it by distance
        //positions forward (+) or backward (-)
        Collections.rotate(list, -2);
        System.out.println("rotate: "+ list);
        // copy collection
        List<String> listDestination = Arrays.asList("green", "black");
        Collections.copy(list, listDestination);
        System.out.println(list);
        // returns the total number of occurrences of the
        // specified element in the list
        System.out.println(Collections.frequency(list, "first"));
    }
}



