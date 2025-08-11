package assignment7;

class MyThreadr extends Thread {
    public MyThreadr(ThreadGroup group, String name) {
        super(group, name); 
    }

    public void run() {
        System.out.println(getName() + " is running in " + getThreadGroup().getName());
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished.");
    }
}
public class threadgrpdemo {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");
        MyThreadr t1 = new MyThreadr(group, "Thread-1");
        MyThreadr t2 = new MyThreadr(group, "Thread-2");
        MyThreadr t3 = new MyThreadr(group, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        group.list();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads in the group are done.");
    }
}
