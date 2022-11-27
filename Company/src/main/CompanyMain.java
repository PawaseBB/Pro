package main;

import resources.Godown;
import threads.Costamor1;
import threads.Costamor2;
import threads.Supplier;

public class CompanyMain {

	public static void main(String[] args) {
		Godown godown=new Godown(100);
		Costamor1 costamor1=new Costamor1(godown);
		Costamor2 costamor2=new Costamor2(godown);
		Supplier supplier=new Supplier(godown);
		
		costamor1.start();
		costamor2.start();
		supplier.start();
	}

}
