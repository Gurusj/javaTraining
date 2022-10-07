package org.example;

class T2 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++)
        System.out.println(i+" from "+Thread.currentThread().getName());
    }
}
public class ThreadDemo2{
    public static void main(String args[]) throws InterruptedException {
        T2 t = new T2();
        t.setName("CustomThread");
        t.start();
        t.join();
        for(int i=1; i<=10; i++){
            System.out.println(i+" from "+Thread.currentThread().getName());
        }
    }
}

