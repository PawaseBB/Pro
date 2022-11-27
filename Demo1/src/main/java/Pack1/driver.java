package Pack1;

public class driver {

	public static void main(String[] args) {
		UpDown2 a1=new UpDown2();
		a1.t1();
		a1.t2();
		
		UpDown1 a2=new UpDown2();
		a2.t1();
	//	a2.t2(); // CTE:-We can't Access Member of Child Class during UpCasting.
		
		UpDown2 a3=(UpDown2)a2;
		a3.t1();
		a3.t2(); //DownCasting
		
	}

}
