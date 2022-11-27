package resource;

public class Godown {
	
	int product;
	
	public Godown(int product) {
		System.out.println(product+" Product are Available in Company.");
		this.product=product;
	}

	public int checkProduct() {
		return product;
	}
	
	public synchronized void order(int product) {
		System.out.println(product+ "  products are Order by Costomer.");
		if(product>checkProduct())
		{
			System.out.println(product+" are not Available. Please Wait.");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.product-=product;
		System.out.println("Successfully deliverd "+product+" product.");
		System.out.println(this.product+" are remains.");
	}
	
	public synchronized void restoreProduct(int product) {
		System.out.println("Restoring "+product+" products.");
		this.product+=product;
		System.out.println("Now "+checkProduct()+" are Available.");
		this.notify();
	}
}
