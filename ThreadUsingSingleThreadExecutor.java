package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task3 extends Thread{
    public void run(){
        System.out.println("Name of Thread is: "+Thread.currentThread().getName());
    }
}
public class ThreadUsingSingleThreadExecutor {
    public static void main(String args[]){

        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i=1; i<=100; i++){
            service.execute(new Task3());
        }
        service.shutdown();
    }
}
