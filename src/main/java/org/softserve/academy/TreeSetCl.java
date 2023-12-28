package org.softserve.academy;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetCl {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        set.add("Mike");
        set.add("Nike");
        set.add("Alex");
        set.add("Sara");
        for (String s : set) { System.out.println(s); }
    }
}
