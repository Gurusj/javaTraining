package org.example;

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
    }
}
