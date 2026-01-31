package shadowing_multilevel;

public class B3 extends B2{

	int b=30;
	
	public void display() {
		
		
		message(); //this.message();
		
		super.message();
		
		((B1)this).message(20); //had to do this due to method overriding
		
		
		System.out.println(b); //access own class
		System.out.println(super.b); //access variable B2
		System.out.println(((B2)this).b); //same as previous line  b2 ---> Constructor ----> this calls the non static variable
		System.out.println(((B1)this).b);
	}
	
	public void message() {
		System.out.println("Class B3 message");
	}
	
	public static void main(String[] args) {
		B3 b3=new B3();
		b3.display();
	}
}
