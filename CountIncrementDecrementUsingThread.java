package org.example;

class T extends Thread{
     static int count = 0;
    void increment() throws InterruptedException {
        sleep(1000);
        this.count++;
        //this.count = this.count+1;
    }
    void decrement() throws InterruptedException{
        sleep(1000);
        this.count--;
       // this.count = this.count -1;
    }
    public void run(){
        try {
            increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.count+" from inc "+Thread.currentThread().getName());
        try {
            decrement();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.count+" from dec "+Thread.currentThread().getName());
    }
}
public class CountIncrementDecrementUsingThread {
    public static void main(String args[]){
        T t1 = new T();
        t1.setName("1st Thread");
        T t2 = new T();
        t2.setName("2nd Thread");

        t1.start();
        t2.start();
        //System.out.println(t1.count);
    }

}
