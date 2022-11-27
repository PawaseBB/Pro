package threads;

import resource.Pizza;

public class Friends extends Thread {
	
	Pizza pizza;
	
	public Friends(Pizza pizza) {
		this.pizza=pizza;
	}
	
	public void run() {
		pizza.orderPizza(50);
	}
}
