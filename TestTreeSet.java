package org.example;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String args[]){
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Rahul");
        treeSet.add("Abhi");
        treeSet.add("Nahush");
        treeSet.add("Vivek");
        treeSet.add("Saru");
        treeSet.add("Bharat");
        treeSet.add("Chetan");

        System.out.println(treeSet);
    }

}
