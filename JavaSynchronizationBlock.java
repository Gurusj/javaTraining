package org.example;
public class JavaSynchronizationBlock {
    int count = 0;
    void inc() throws InterruptedException {
        System.out.println("Im synchronized"+Thread.currentThread().getName());
        synchronized (this){
            count++;
        }
    }
    public static void main(String args[]) throws InterruptedException {
        JavaSynchronizationBlock d1 = new JavaSynchronizationBlock();

        class Thread2 extends Thread{
            @Override
            public void run() {
                try {
                    for (int i=0; i<1000; i++){
                        d1.inc();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        class Thread1 extends Thread{
            @Override
            public void run() {
                try {
                    for (int i=0; i<1000; i++){
                        d1.inc();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        Thread1 t1 =new Thread1();
        Thread2 t2 =new Thread2();

        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(d1.count);

    }
}
