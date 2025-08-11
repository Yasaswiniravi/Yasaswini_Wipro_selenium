package assignment7;

class MyThread5 extends Thread {
    public MyThread5(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class threadprioritydemo {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5("Thread 1");
        MyThread5 t2 = new MyThread5("Thread 2");
        MyThread5 t3 = new MyThread5("Thread 3");
        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);   
        t3.setPriority(Thread.MAX_PRIORITY);    
        t1.start();
        t2.start();
        t3.start();
    }
}

