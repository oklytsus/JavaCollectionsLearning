package org.softserve.academy;

// Java program to demonstrate working of Collections.
// binarySearch()
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
        import java.util.List;

public class BinarySearchC {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);

        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println(index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch(al, 13);
        System.out.println(index);
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        //Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorted list: "+list);
        System.out.println(Collections.binarySearch(list, "second", Collections.reverseOrder()));
    }
}