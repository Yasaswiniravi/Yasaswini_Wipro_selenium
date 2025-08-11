package assignment7;

class BankAccount {
    private int balance = 1000; 
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + 
                           " | New Balance: " + balance);
    }
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + 
                               " | New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + 
                               " | Not enough balance!");
        }
    }
}
class DepositThread extends Thread {
    BankAccount account;
    DepositThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.deposit(500);
    }
}
class WithdrawThread extends Thread {
    BankAccount account;
    WithdrawThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw(700);
    }
}
public class Bankacc {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new DepositThread(account);
        Thread t2 = new WithdrawThread(account);
        Thread t3 = new WithdrawThread(account);
        t1.setName("Thread-Deposit");
        t2.setName("Thread-Withdraw1");
        t3.setName("Thread-Withdraw2");
        t1.start();
        t2.start();
        t3.start();
    }
}
