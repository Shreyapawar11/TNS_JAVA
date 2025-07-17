package AtmMachine;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double balance = 10000.0; // Initial balance
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n===== ATM Menu =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your Balance: ₹" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: ₹");
	                    double deposit = scanner.nextDouble();
	                    if (deposit > 0) {
	                        balance += deposit;
	                        System.out.println("₹" + deposit + " deposited successfully.");
	                    } else {
	                        System.out.println("Invalid amount.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter amount to withdraw: ₹");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw > 0 && withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("₹" + withdraw + " withdrawn successfully.");
	                    } else {
	                        System.out.println("Insufficient balance or invalid amount.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	}

}
