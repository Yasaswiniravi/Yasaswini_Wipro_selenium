package assignment7;

class StoppableThread extends Thread {
    private volatile boolean running = true;
    public void run() {
        int count = 1;
        while (running) {
            System.out.println("Thread running: " + count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped.");
    }
    public void stopRunning() {
        running = false;
    }
}
public class stopthreaddemo {
    public static void main(String[] args) {
        StoppableThread t = new StoppableThread();
        t.start();

        try {
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stopRunning();  
    }
}
