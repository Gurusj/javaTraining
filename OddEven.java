
public class OddEven {
    int i =1;
     void odd(int n) throws InterruptedException {
         synchronized (this) {
             while(i < n) {
                 if (i % 2 == 0) {
                     wait();
                 }
                 Thread.sleep(500);
                 System.out.println(i + ": " + Thread.currentThread().getName());
                 i++;
                 notify();
             }
         }
     }
    void even(int n) throws InterruptedException {

        synchronized (this) {
            while(i < n) {
                if (i % 2 != 0) {
                    wait();
                }
                Thread.sleep(500);
                System.out.println(i + ": " + Thread.currentThread().getName());
                i++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEven obj = new OddEven();

        class Thread1 extends Thread{
            public void run(){
                try {
                    obj.even(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        class Thread2 extends Thread{
            public void run(){
                    try {
                        obj.odd(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        //Thread t1 = new Thread(a);
        a.setName("Even Thread");
        //Thread t2 = new Thread(b);
        b.setName("Odd Thread");
        a.start();
        b.start();
    }
}
