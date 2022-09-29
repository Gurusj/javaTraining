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
        while (presentNode.nxt != null){
            System.out.print(presentNode.data+"->");
            presentNode = presentNode.nxt;
        }
        System.out.println(presentNode.data);
    }
}
public class LinkedListTest {
    public static void main(String args[]){
        MyLL obj1 = new MyLL();

        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        obj1.add(50);
        obj1.displayList();
    }
}
