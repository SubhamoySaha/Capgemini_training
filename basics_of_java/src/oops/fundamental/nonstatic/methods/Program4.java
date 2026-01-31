package oops.fundamental.nonstatic.methods;

public class Program4 {

	public static void main(String[] args) {
//		demo(); //this gives error
		Program4 obj=new Program4();
		obj.demo(); //This is ok
	}
	
	public void demo() {
		System.out.println("Demo");
	}
}
