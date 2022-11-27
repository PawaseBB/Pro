package threads;

import resources.Godown;

public class Costamor1 extends Thread {
	
	Godown godown;
	
	public Costamor1(Godown godown) {
		
		this.godown=godown;
		
	}
	
	@Override
	public void run() {
		godown.orderProduct(50);
	}
}
