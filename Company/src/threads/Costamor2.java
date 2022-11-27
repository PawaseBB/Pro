package threads;

import resources.Godown;

public class Costamor2 extends Thread {
	
Godown godown;
	
	public Costamor2(Godown godown) {
		
		this.godown=godown;
		
	}
	
	@Override
	public void run() {
		godown.orderProduct(70);
	}
}
