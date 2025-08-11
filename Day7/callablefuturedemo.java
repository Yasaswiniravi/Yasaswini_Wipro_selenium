package assignment7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MultiplyTask implements Callable<Integer> {
    private int a, b;
    public MultiplyTask(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Integer call() {
        System.out.println("Calculating " + a + " × " + b);
        return a * b;
    }
}
public class callablefuturedemo {
    public static void main(String[] args) {
        MultiplyTask task = new MultiplyTask(5, 6);
        FutureTask<Integer> future = new FutureTask<>(task);
        Thread t = new Thread(future);
        t.start();
        try {
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

