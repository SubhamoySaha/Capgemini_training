package oops.fundamental.nonstatic;

public class Program1 {

	static Program1 obj1;
	int a=3;
//	Program1()
//	{
//		a=10;
//	}
//	
	public static void main(String[] args) {
		Program1 obj2=new Program1();
		System.out.println(obj1);
		System.out.println(obj2.a);
	}
}