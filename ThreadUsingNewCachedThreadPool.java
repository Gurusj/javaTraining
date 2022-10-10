package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread{
    public void run(){
        System.out.println("Name of Thread is: "+Thread.currentThread().getName());
    }
}
public class ThreadUsingNewCachedThreadPool {
    public static void main(String args[]){

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i=1; i<=100; i++){
            service.execute(new Task1());
        }
        service.shutdown();
    }
}
