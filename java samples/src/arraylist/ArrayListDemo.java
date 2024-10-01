package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    // ArrayList id part of the collections in Java
    // ArrayList id part of Generics (<>)
    // ArrayLists work with reference types and not primitives
    // has got methods to add edit remove search elements

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // create a list of names
        // adding names
        names.add("Alex");
        names.add("David");
        names.add("James");
        names.add("Jim");
        names.add("James");

        // display the list
        for (String name : names) {
            System.out.println(name);
        }

        // methods in ArrayList
        System.out.println(names.size()); // number of elements in the list
        names.set(1, "ABC"); // updating element at index 1
        for (String name : names) { // print after update
            System.out.println(name);
        }
        System.out.println(names.get(0)); // print the first element

        names.remove(1); // remove element at index 1
        for (String name : names) { // print after remove
            System.out.println(name);
        }

        boolean exists = names.contains("Alex"); // search on the array list
        System.out.println(exists);

        int idx = names.indexOf("James"); // return the index of an element (-1 if element is not present)
        System.out.println(idx);

        boolean isEmpty = names.isEmpty(); // check if the List is Empty
        System.out.println(isEmpty);

        names.clear(); // clear all elements
        System.out.println(names.size());
        for (String name : names) { // print after clear
            System.out.println(name);
        }

    }

}
