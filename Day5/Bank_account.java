package Assignment5;
/*3. Advanced: Bank Account with Deposit/Withdraw Logic
Transaction validation and encapsulation protection.
•	Create a BankAccount class with private accountNumber, accountHolder, balance.
•	Provide:
o	deposit(double amount) — ignores or rejects negative.
o	withdraw(double amount) — prevents overdraft and returns a boolean success.
o	Getter for balance but no setter.
•	Optionally override toString() to display masked account number and details.
•	Track transaction history internally using a private list (or inner class for transaction object).
•	Expose a method getLastTransaction() but do not expose the full internal list. */
import java.util.ArrayList;
import java.util.List;
class Transaction {
    String type;
    double amount;
    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String toString() {
        return type + ": ₹" + amount;
    }
}
public class Bank_account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();
    public Bank_account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) {
            return "No transactions yet.";
        }
        return transactionHistory.get(transactionHistory.size() - 1).toString();
    }
    public String toString() {
        String masked = "****" + accountNumber.substring(accountNumber.length() - 4);
        return "Account Holder: " + accountHolder +
                "\nAccount Number: " + masked +
                "\nBalance: ₹" + balance;
    }
    public static void main(String[] args) {
        Bank_account account = new Bank_account("1234567890", "Anish", 5000.0);
        System.out.println(account);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(5000);
        System.out.println("\nCurrent Balance: ₹" + account.getBalance());
        System.out.println("Last Transaction: " + account.getLastTransaction());
        System.out.println("\n" + account);
    }
}

