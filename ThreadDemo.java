package org.example;
class T1 extends Thread{
    @Override
    public void run(){
        System.out.println("Statement from: "+Thread.currentThread().getName());
    }
}
public class ThreadDemo{
    public static void main(String args[]){
        System.out.println("Statement from: "+Thread.currentThread().getName());
        T1 t = new T1();
        t.setName("CustomThread 1");
        t.start();
    }
}
