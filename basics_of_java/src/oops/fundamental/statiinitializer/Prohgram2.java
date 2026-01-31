package oops.fundamental.statiinitializer;

public class Prohgram2 {

	static int i=20; //single initializer
	
	static {//multi line  initializer
		i=30;
		System.out.println(i);
		System.out.println("Static Initiializer block 1");
		i=test1();
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(i);
		System.out.println("Main End");
	}
	
	
	public static int test1()
	{
		System.out.println("test1");
		System.out.println(i);
		return 10;
	}
	
	static {
		System.out.println("Static Initiializer block 2");
		
	}
}
