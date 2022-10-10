package org.example;

class ThreadImplement implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
public class ThreadByImplementingRunnable {
    public static void main(String[] args){
        ThreadImplement t = new ThreadImplement();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
