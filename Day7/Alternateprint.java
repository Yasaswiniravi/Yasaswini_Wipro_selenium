package assignment7;

class SharedPrinter {
    private boolean letterTurn = true; 
    public synchronized void printLetter(char letter) {
        while (!letterTurn) { 
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.print(letter + " ");
        letterTurn = false; 
        notify();
    }
    public synchronized void printNumber(int number) {
        while (letterTurn) { 
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.print(number + " ");
        letterTurn = true; 
        notify();
    }
}
class LetterThread extends Thread {
    private SharedPrinter printer;

    LetterThread(SharedPrinter printer) {
        this.printer = printer;
    }
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            printer.printLetter(ch);
        }
    }
}
class NumberThread extends Thread {
    private SharedPrinter printer;

    NumberThread(SharedPrinter printer) {
        this.printer = printer;
    }
    public void run() {
        for (int num = 1; num <= 26; num++) {
            printer.printNumber(num);
        }
    }
}
public class Alternateprint {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        LetterThread t1 = new LetterThread(printer);
        NumberThread t2 = new NumberThread(printer);
        t1.start();
        t2.start();
    }
}

