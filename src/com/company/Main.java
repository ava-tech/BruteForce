package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String a[] = new String[2];
        a[0] = "Hello";
        a[1] = "World";

        System.out.println(countGreaterThan(a, "W"));

    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
