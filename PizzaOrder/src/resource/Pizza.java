package resource;

public class Pizza {
	
	int noOfPizza;
	
	public Pizza(int noOfPizza) {
		System.out.println(noOfPizza + "pizzas are Available");
		this.noOfPizza=noOfPizza;
	}
	
	public int checkPizza() {
		return this.noOfPizza;
		
	}
	
	public synchronized void orderPizza(int noOfPizza) {
		
		System.out.println("ordering "+noOfPizza+" Pizzas" );
		
		if(noOfPizza>checkPizza())
		{
			try {
				System.out.println(noOfPizza+" not Available. Please wait.");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.noOfPizza-=noOfPizza;
			System.out.println("Sucessfully delivard "+noOfPizza+" Pizzas");
			System.out.println(checkPizza()+ " are remainnig");
		}
	}
	
	public synchronized void bakePizza(int noOfPizza) {
		
		this.noOfPizza+=noOfPizza;
		System.out.println("Backing "+noOfPizza+" Pizzas");
		System.out.println(checkPizza()+" Pizzas Available");
		this.notify();
		
	}
	

}
