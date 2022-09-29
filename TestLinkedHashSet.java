package org.example;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String args[]){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(55);
        linkedHashSet.add(null);
        linkedHashSet.add(10);
        linkedHashSet.add(60);
        linkedHashSet.add(20);
        linkedHashSet.add(null);
        linkedHashSet.add(1);
        linkedHashSet.add(30);

        System.out.println(linkedHashSet);
    }
}

