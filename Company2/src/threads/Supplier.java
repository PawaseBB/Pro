package threads;

import resource.Godown;

public class Supplier extends Thread {
	
	Godown godown;
	
	
	public Supplier(Godown godown) {
		this.godown=godown;
	}
	
	@Override
	public void run() {
		godown.restoreProduct(100);
	}

}
