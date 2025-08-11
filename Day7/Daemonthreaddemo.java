package assignment7;

import java.time.LocalTime;
class TimePrinter extends Thread {
    public void run() {
        while (true) {
            System.out.println("Current Time: " + LocalTime.now());
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted.");
            }
        }
    }
}
public class Daemonthreaddemo {
    public static void main(String[] args) {
        TimePrinter daemonThread = new TimePrinter();
        daemonThread.setDaemon(true); 
        daemonThread.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread working: step " + i);
            try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread finished. Daemon will stop automatically.");
    }
}
