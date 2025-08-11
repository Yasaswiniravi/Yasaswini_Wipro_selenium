package assignment7;

class SharedData {
    private int data;
    private boolean hasData = false; 
    public synchronized void produce(int value) {
        while (hasData) { 
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify(); 
    }
    public synchronized void consume() {
        while (!hasData) { 
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); 
    }
}
class Producer extends Thread {
    private SharedData shared;

    Producer(SharedData shared) {
        this.shared = shared;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.produce(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
class Consumer extends Thread {
    private SharedData shared;

    Consumer(SharedData shared) {
        this.shared = shared;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.consume();
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class producerconsumer {
    public static void main(String[] args) {
        SharedData shared = new SharedData();

        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        producer.start();
        consumer.start();
    }
}
