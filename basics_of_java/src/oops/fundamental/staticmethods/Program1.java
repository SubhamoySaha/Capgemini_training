package oops.fundamental.staticmethods;

public class Program1 {
	static int i;
	public static void main(String[] args) {
		System.out.println("Program1 main started");

		System.out.println("Program1 main ended");
	}
	
	public static void test1() {
		System.out.println(i);
		System.out.println("test1() from Program2");
	}
}
