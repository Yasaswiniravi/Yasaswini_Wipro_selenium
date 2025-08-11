package assignment7;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class thread_demo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); 
    }
}
