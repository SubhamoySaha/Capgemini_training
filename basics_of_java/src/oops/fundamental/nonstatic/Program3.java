package oops.fundamental.nonstatic;

public class Program3 {

	int a=10;
	static String s="Hi";
	public static void main(String[] args) {
		Program3 obj1=new Program3();
		obj1.a=100;
		obj1.s="Hello";
		
		Program3 obj2=new Program3();
		System.out.println(obj2.a); //prints: 10
		System.out.println(obj2.s);//prints: Hello as Static members are in shared memory
		
		
	}
}
