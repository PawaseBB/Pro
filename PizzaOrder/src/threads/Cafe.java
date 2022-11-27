package threads;

import resource.Pizza;

public class Cafe extends Thread{
	


		Pizza pizza;
		
		public Cafe(Pizza pizza) {
			this.pizza=pizza;
		}
		
		public void run() {
			pizza.bakePizza(30);
		}
	}


