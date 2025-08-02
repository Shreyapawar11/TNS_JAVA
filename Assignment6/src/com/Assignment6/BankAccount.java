package com.Assignment6;
//Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid amount
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

public class BankAccount {
 private int accountNumber;
 private double balance;

 /**
  * Parameterized constructor to initialize account number and balance
  * @param accountNumber the account number
  * @param initialBalance the initial balance
  */
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 /**
  * Method to deposit amount into the account
  * @param amount the amount to deposit
  * @throws InvalidAmountException if the deposit amount is invalid
  */
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Invalid deposit amount: " + amount);
     }
     balance += amount;
 }

 /**
  * Method to withdraw amount from the account
  * @param amount the amount to withdraw
  * @throws InsufficientFundsException if the account balance is insufficient
  * @throws InvalidAmountException if the withdrawal amount is invalid
  */
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Invalid withdrawal amount: " + amount);
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal: " + amount);
     }
     balance -= amount;
 }

 /**
  * Method to display the account balance
  */
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: " + balance);
 }

 public static void main(String[] args) {
     BankAccount account = new BankAccount(12345, 1000.0);

     try {
         account.deposit(500.0);
         account.displayBalance();
         account.withdraw(200.0);
         account.displayBalance();
         account.withdraw(2000.0); // This will throw InsufficientFundsException
     } catch (InsufficientFundsException e) {
         System.out.println(e.getMessage());
     } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
     } finally {
         account.displayBalance();
     }
 }
}

