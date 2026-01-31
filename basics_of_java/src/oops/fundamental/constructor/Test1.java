package oops.fundamental.constructor;

public class Test1 {
	
static int count=0;
	
	{
		count++;
	}
	//factory method
	public static Test1 m1() {
		System.out.println("m1()");
		return new Test1();
	}

	public static void main(String[] args) {
		
		m1().m1().m2().m3();
		System.out.println(count);
		//String s="programming";
		
		
		//System.out.println(s.toUpperCase().substring(2).replaceAll("[A-Z]","1"));
		
		//System.out.println(s.substring(2).toUpperCase().charAt(0));
		
	}
	
     public Test1 m2() {
		System.out.println("m2()");
		return new Test1(); //new operrator returns new references each time
	 }
     
     public Test1 m3() {
 		System.out.println("m3()");
 		return this; //this retains the current reference
 		
 	 }

}
