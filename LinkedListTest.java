package org.example;

import java.sql.Array;
import java.util.*;

class Node{
    int data;
    Node nxt;
    Node(int data){
        this.data = data;
        this.nxt = null;
    }
}

class MyLL{
    Node head;
    Node add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node lastNode = head;
            while (lastNode.nxt != null){
                lastNode = lastNode.nxt;
            }
            lastNode.nxt = newNode;
        }
        return newNode;
    }

    void displayList(){
        Node presentNode = head;
        if (head == null){
            System.out.println("List is empty");
        }else{
            while (presentNode.nxt != null){
                System.out.print(presentNode.data+"->");
                presentNode = presentNode.nxt;
            }
            System.out.println(presentNode.data);
        }

    }

    Integer[] addAll(Integer[] arr){
        for (int l: arr)
        {
            add(l);
        }
        return arr;
    }

    MyLL remove(MyLL list, int data){
        Node presentNode = list.head, previous = null;

        if(presentNode != null && presentNode.data == data){
            head = presentNode.nxt;
            System.out.println("Deleted "+data);
            return list;
        }

        while(presentNode != null && presentNode.data != data){
            previous = presentNode;
            presentNode = presentNode.nxt;
        }

        if(presentNode != null){
            previous.nxt = presentNode.nxt;
            System.out.println("Deleted "+data);
        }

        if(presentNode == null){
            System.out.println("not found "+data);
        }
        return list;
    }
    void removeAll(){
        head = null;
    }
}
public class LinkedListTest {
    public static void main(String args[]){
        MyLL obj1 = new MyLL();
        System.out.println("*****add() method******");
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        obj1.add(50);
        obj1.displayList();

        System.out.println("\n*****addAll() method*****");
        MyLL obj2 = new MyLL();
        Integer[] arr = {60,70,80};
        obj2.addAll(arr);
        obj2.displayList();

        System.out.println("\n******remove() method*****");
        obj1.remove(obj1,30);
        obj1.displayList();
        System.out.println("\n*****removeAll() method******");
        obj1.removeAll();
        obj1.displayList();

    }
}
