package org.example;
class NodeStruct{
    int data;
    NodeStruct nxt;
    NodeStruct(int data){
        this.data = data;
        this.nxt = null;
    }
}
class CreateLL{
    NodeStruct add(int data){
        NodeStruct newNode = new NodeStruct(data);
        return newNode;
    }
    int getDataOfLastNode(NodeStruct n){
        while(n.nxt!=null){
            n = n.nxt;
        }
        return n.data;
    }
}
public class LinkedListDemo {
    public static void main(String args[]){
        CreateLL obj1 = new CreateLL();

        NodeStruct n1 = obj1.add(10);
        NodeStruct n2 = obj1.add(20);
        NodeStruct n3 = obj1.add(30);
        NodeStruct n4 = obj1.add(40);
        NodeStruct n5 = obj1.add(50);

        n1.nxt = n2;
        n2.nxt = n3;
        n3.nxt = n4;
        n4.nxt = n5;
        n5.nxt = null;

        int lastNodeValue = obj1.getDataOfLastNode(n1);
        System.out.println(lastNodeValue);

    }
}
