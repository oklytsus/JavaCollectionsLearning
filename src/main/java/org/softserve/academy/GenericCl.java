package org.softserve.academy;
// Java program to show working of user defined
// Generic classes

import java.util.Arrays;



// We use < > to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    } // constructor

    public T getObject() {
        return this.obj;
    }
}

// Driver class to test above
class GenericMethod {
    <T> void sampleMethod(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        public static <T, E> void sampleMethod(T[] array, E ele ) {
//            System.out.println(Arrays.toString(array));
//            System.out.println(ele);
//        }
    }
}
public class GenericCl {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        GenericMethod obj = new GenericMethod();
        Integer intArray[] = {45, 26, 89, 96};
        obj.sampleMethod(intArray);
        String stringArray[] = {"Krishna", "Raju", "Seema", "Geeta"};
        obj.sampleMethod(stringArray);
    }
}

