package assignment7;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished.");
    }
}
public class isalivedemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Before start: isAlive = " + t1.isAlive());
        t1.start();
        System.out.println("After start: isAlive = " + t1.isAlive());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After completion: isAlive = " + t1.isAlive());
    }
}

