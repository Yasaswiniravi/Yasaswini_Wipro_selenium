package assignment7;

class Counter {
    int count = 0; 
    public void increment() {
        count++; 
    }
}
class MyThread3 extends Thread {
    Counter counter;
    MyThread3(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class Raceconditiondemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread3 t1 = new MyThread3(counter);
        MyThread3 t2 = new MyThread3(counter);
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
