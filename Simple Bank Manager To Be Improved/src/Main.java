import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to our bank app!");

		do {

			System.out.println("What would you like to do?");
			System.out.println("1) Check balance.");
			System.out.println("2) Make a deposit.");
			System.out.println("3) Make a withdrawal.");
			System.out.println("4) Exit the app.");

			int choice = scanner.nextInt();

			switch (choice) {
				case 1 -> System.out.println("Current Balance is: $" + bank.getBalance());
				case 2 -> {
					double amount;
					System.out.println("Please enter the amount you'd like to deposit.");
					amount = scanner.nextDouble();
					if (amount <= 0) {
						System.out.println(
										"You cannot deposit negative money, please try again!");
					} else {
						bank.makeDeposit(amount);
						System.out.println("Successfully deposited: $" + amount);
						System.out.println("Current balance is: $" + bank.getBalance());
					}

				}
				case 3 -> {
					double amount;
					System.out.println("Please enter the amount you'd like to withdraw.");
					amount = scanner.nextDouble();
					if (amount > bank.getBalance()) {
						System.out.println(
										"You can't withdraw more than you currently have in your account,"
														+ " your current balance is: $"
														+ bank.getBalance());
					} else if (amount <= 0) {
						System.out.println("You cannot withdraw $0, or a negative amount.");
					} else {
						bank.makeWithdrawal(amount);
						System.out.println("Successfully withdrawn: $" + amount);
						System.out.println("Current Balance is: $" + bank.getBalance());
					}
				}
				case 4 -> {
					System.out.println("Thank you for using our app!");
					System.exit(1);
				}
				default ->
								System.out.println("Index out of range. Please enter numbers 1-4.");
			}
		} while (true);
	}
}