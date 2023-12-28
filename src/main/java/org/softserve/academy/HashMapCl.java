package org.softserve.academy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCl {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //add elements to the map
        hashMap.put(1, "Mike");
        hashMap.put(2, "Nick");
        hashMap.put(3, "Sara");
        //get object by key 2
        String element = hashMap.get(2);
        System.out.println("Element by key 2: " + element);
        //returns a Set containing all map values
        Set<Integer> keys = hashMap.keySet();
        // get a set of all values
        Collection<String> values = hashMap.values();
        //replace element
        hashMap.replace(3, "Alex");
        // deleting element by key 1
        hashMap.remove(1);
        // iterate through elements
        for (Integer key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }
        System.out.println("Another hashMap: ");
        HashMapCl myObj= new HashMapCl();
        myObj.newMap();

    }
    private void newMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mike");
        hashMap.put(2, "Nick");
        hashMap.put(3, "Sara");
        hashMap.put(1, "Alex");
        hashMap.put(4, null);
        hashMap.put(5, null);
        hashMap.put(null, "Simon");
        //entrySet() method returns a set of all elements as Map.Entry<K, V> objects
        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
