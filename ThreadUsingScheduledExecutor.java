package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class TaskA implements Runnable{

    @Override
    public void run() {
        System.out.println("Running Job 1...");
    }
}
public class ThreadUsingScheduledExecutor {

    public static void main(String[] args) {

        TaskA t = new TaskA();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable job2 = () -> System.out.println("Running Job 2...");
        Thread newThreead = new Thread(t);
        newThreead.start();
        scheduledExecutorService.schedule(job2, 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

}

