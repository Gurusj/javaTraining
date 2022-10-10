package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task4 extends Thread{
    public void run(){
        System.out.println("Name of Thread is: "+Thread.currentThread().getName());
    }
}
public class ThreadUsingFixedThreadPool {
    public static void main(String args[]){

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i=1; i<=100; i++){
            service.execute(new Task4());
        }
        service.shutdown();
    }
}
