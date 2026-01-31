package Abstraction_oops;

public class B extends A{
	
	public void test() {
		System.out.println("B implementatiomn");
		
	}
	
	public void testB() {
		System.out.println("test B");
	}
	
	public static void main(String[] args) {
		//A a=new A(); //CTE--->Abstract class cannot be instantiated
		//a.test();
		
		//UPCASTING IS IMPORTANT FOR ABSTRACTION
		
		A a=new B();//B object is created
		a.testA();
		a.test();//So test() of B gets executed as JVM starts from below to check child to parent
		//a.testB(); //CTE---> because a can only access to A and Object class compartment although it is a instance of B
		
		
		//
		
		
		B b1=new B();
		b1.testA();
		
		B b=(B)a;
		b.testB();
		b.testA();
		b.test();
		
	}

}
