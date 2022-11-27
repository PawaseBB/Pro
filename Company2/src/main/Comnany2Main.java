package main;

import resource.Godown;
import threads.Costomer;
import threads.Supplier;

public class Comnany2Main {

	public static void main(String[] args) {
		
		Godown godown=new Godown(100);
		Costomer costomer1=new Costomer(godown, 50);
		Costomer costomer2=new Costomer(godown, 70);
		Supplier supplier=new Supplier(godown);
		
		costomer1.start();
		costomer2.start();
		supplier.start();
	}

}
