package assignment7;
class Counter3 {
    int count = 0; 
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}
class MyThreadt extends Thread {
    Counter3 counter;
    MyThreadt(Counter3 counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class synchronizeblock {
    public static void main(String[] args) {
        Counter3 counter = new Counter3();
        MyThreadt t1 = new MyThreadt(counter);
        MyThreadt t2 = new MyThreadt(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Counter Value: " + counter.count);
    }
}
 
