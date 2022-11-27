package resource;

public class Account {
	
	double accountBalance;
	
	public Account(double accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public void checkedBalance() {
		System.out.println(accountBalance);
	}
	
	public synchronized void deposit(double amount) {
		accountBalance += amount;
		checkedBalance();
	}
	
	public synchronized void withdraw(double amount) {
		if(accountBalance >= amount)
		{
			accountBalance -= amount;
			checkedBalance();
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
}
