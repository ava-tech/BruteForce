package com.section.four;


public class OrderedPair<K, V> implements Pair<K, V>{

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("Alam", 2017);
        System.out.println(p1.getValue());

        //Generic version. Type assigned during instantiation
        Pair<?, ?> p2[] = new Pair[2];

        p2[0] = new OrderedPair<>("EmployeeId", 100);   //K=String, V=Integer
        p2[1] = new OrderedPair<>("Name", "Alam");      //K=String, V=String

        for(Pair<?, ?> p : p2 )
            System.out.println(p.getKey() + " : " + p.getValue());

        //ArrayList version of Generic
        java.util.List<Pair<?, ?>> l1 = new java.util.ArrayList<>();
        for(int i=0; i<5; i++){
            l1.add(new OrderedPair<>(i, "Hello"));
        }
        for(Pair<?, ?> l : l1 )
            System.out.println(l.getKey() + " : " + l.getValue());
    }
}

