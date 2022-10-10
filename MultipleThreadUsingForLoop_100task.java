package org.example;

class Task2 extends Thread{
    public void run(){
        System.out.println("Name of Thread is: "+Thread.currentThread().getName());
    }
}
public class MultipleThreadUsingForLoop_100task {
    public static void main(String args[]){
        for (int i=1; i<=10; i++){
            Task2 t = new Task2();
            t.start();
            t.setName(i+" Thread");
        }
    }
}
