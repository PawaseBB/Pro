package threads;

import resource.Godown;

public class Costomer extends Thread{
	
	Godown godown;
	int product;
	
	public Costomer(Godown godown, int product) {
		this.godown=godown;
		this.product=product;
	}
	
	@Override
	public void run() {
		godown.order(product);
	}
}
