package assignment7;

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class threadjoindemo {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.setName("Worker Thread");
        t.start();
        try {
            t.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread continues after Worker Thread finishes.");
    }
}
 