package oops.fundamental.nonstatic;

public class Program2 {

	int i=3; //in object heap area only this will be loaded 
	static String s="Hello"; //this will be loaded in the class static area
	public static void main(String[] args) {
		Program2 obj1=new Program2();
		
		Program2 obj2=new Program2();
		System.out.println(obj1==obj2); //false
		
	}
}
