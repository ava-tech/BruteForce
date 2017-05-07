package com.section.four;

public class Box<T> {

    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<String> b1 = new Box();
        b1.set("Hello");

        Box<Integer> b2 = new Box();
        b2.set(123);

        System.out.println("B1 is String Object: " + b1.get());
        System.out.println("B2 is Integer Object: " + b2.get());

        int i = b2.get();

        System.out.println("Object B2's primitive value: " + i);

    }
}
