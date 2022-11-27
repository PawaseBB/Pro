package resource;

import threads.Husband;
import threads.Wife;

public class AccontMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account=new Account(5000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		
		husband.start();
		wife.start();
		

	}

}
