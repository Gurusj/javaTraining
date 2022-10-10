package org.example;

class Task extends Thread{
    public void run(){
        System.out.println("Name of Thread is: "+Thread.currentThread().getName());
    }
}
public class MultipleThreadsCreationUsingForLoop_10task {
    public static void main(String args[]){
        for (int i=1; i<=10; i++){
            Task t = new Task();
            t.start();
            t.setName(i+" Thread");
        }
    }
}
