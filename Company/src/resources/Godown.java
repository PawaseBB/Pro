package resources;

public class Godown {
	
	int storedProduct;
	
	public Godown(int storedProduct) {
		System.out.println(storedProduct+" Product Available");
		this.storedProduct=storedProduct;
	}
	
	public int checkStoredProduct() {
		return this.storedProduct;
	}
	
	
	public synchronized void orderProduct(int storedProduct) {
		System.out.println("Ordering "+storedProduct+" Product.");
		
		if(storedProduct>checkStoredProduct())
		{
			try {
				System.out.println(storedProduct+" Product not Available. Please wait.");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.storedProduct-=storedProduct;
		System.out.println("Successfully deliverd "+storedProduct+" Product.");
		System.out.println(checkStoredProduct()+" Product Available.");
	}
	
	public synchronized void restockProduct(int storedProduct) {
		
		this.storedProduct+=storedProduct;
		System.out.println("Making "+storedProduct+" Product.");
		System.out.println(checkStoredProduct()+" Product available.");
		this.notify();
	}
}
