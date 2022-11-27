package main;

import resource.Pizza;
import threads.Cafe;
import threads.Friends;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza pizza=new Pizza(30);
		Friends friend=new Friends(pizza);
		Cafe cafe=new Cafe(pizza);
		
		friend.start();
		cafe.start();
	}

}
