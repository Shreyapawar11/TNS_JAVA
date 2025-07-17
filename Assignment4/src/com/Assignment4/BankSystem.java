package com.Assignment4;
import java.util.Scanner;

// Static class
class Bank {
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void incrementAccounts() {
        totalAccounts++;
    }
}

// Abstract class
abstract class Account {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    public Account(String name, int accNo, double bal) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = bal;
        Bank.incrementAccounts();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Subclass: SavingAccount
class SavingAccount extends Account {
    private double interestRate = 0.03;

    public SavingAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("SavingAccount: Deposited ₹" + amount + " with interest.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SavingAccount: Withdrawn ₹" + amount);
        } else {
            System.out.println("SavingAccount: Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends Account {
    private double overdraftLimit = 1000;

    public CheckingAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("CheckingAccount: Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("CheckingAccount: Withdrawn ₹" + amount);
        } else {
            System.out.println("CheckingAccount: Exceeded overdraft limit.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Final class for transactions
class Transaction {
    public final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount + transactionFee);
                System.out.println("Transaction Fee: ₹" + transactionFee);
                break;
            default:
                System.out.println("Invalid transaction type.");
        }

        System.out.println("Balance after transaction: ₹" + account.getBalance());
    }
}

// Main class using switch-case
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample account (you can extend this to create multiple accounts)
        Account account;
        System.out.println("Choose Account Type: \n1. Saving\n2. Checking");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        if (type == 1) {
            account = new SavingAccount("Shreya", 1001, 5000);
        } else {
            account = new CheckingAccount("Shreya", 1002, 3000);
        }

        Transaction transaction = new Transaction();
        int choice;

        do {
            System.out.println("\n====== BANK MENU ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Total Bank Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double amount;
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    transaction.performTransaction(account, "deposit", amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    transaction.performTransaction(account, "withdraw", amount);
                    break;
                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
