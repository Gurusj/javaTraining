package org.example;

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
    Node add(MyLL list, int data){
        Node newNode = new Node(data);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node lastNode = list.head;
            while (lastNode.nxt != null){
                lastNode = lastNode.nxt;
            }
            lastNode.nxt = newNode;
        }
        return newNode;
    }

    void displayList(MyLL list){
        Node presentNode = list.head;
        while (presentNode != null){
            System.out.print(presentNode.data+"\t");
            presentNode = presentNode.nxt;
        }
    }
    int getDataOfLastNode(Node n){
        while(n.nxt!=null){
            n = n.nxt;
        }
        return n.data;
    }
}
public class LinkedListTest {
    public static void main(String args[]){
        MyLL obj1 = new MyLL();

        obj1.add(obj1,10);
        obj1.add(obj1,20);
        obj1.add(obj1,30);
        obj1.add(obj1,40);
        obj1.add(obj1,50);
        obj1.displayList(obj1);
        /*Node n1 = obj1.add(10);
        Node n2 = obj1.add(20);
        Node n3 = obj1.add(30);
        Node n4 = obj1.add(40);
        Node n5 = obj1.add(50);*/

       /* n1.nxt = n2;
        n2.nxt = n3;
        n3.nxt = n4;
        n4.nxt = n5;*/
        //n5.nxt = null;

       /* int lastNodeValue = obj1.getDataOfLastNode(n2);
        System.out.println(lastNodeValue);*/

    }
}
