package oops.fundamental.constructor;

public class Test2 {

	public static void demo(Test2 obj) {
		System.out.println("demo()");
		System.out.println(obj);
		this.test();//null.test()
	}
	
	public static void main(String[] args) {
		
		demo(new Test2());
		//demo(null);
	}
	
	public void test() {
		System.out.println("test()");
		
	}
}
