package threads;

import resource.Account;

public class Husband extends Thread{
	
	Account account;
	
	public Husband(Account account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		account.deposit(1000);
		account.withdraw(500);
	}
}
