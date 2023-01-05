/**
	*  bank
	*
	*/
public class Bank {

	// Initialize double balance to 0 at the creation of a new Bank instance.
	private double balance = 0;

	/**
		* make deposit
		*
		* @param amount amount to deposit
		*/
	public void makeDeposit(double amount) {
		balance += amount;
	}


	/**
		* make withdrawal
		*
		* @param amount amount to withdraw
		*/
	public void makeWithdrawal(double amount) {
		balance -= amount;
	}

	/**
		* get balance
		*
		* @return balance in a double form
		*/
	public double getBalance() {
		return balance;
	}

}
