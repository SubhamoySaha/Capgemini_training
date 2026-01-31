package methods;

public class Program3 {

	public static void main(String[] args) {
		 System.out.println(num(10,20));
		 System.out.println(num(10,20,30));
		 
	}
	
	//Method Overloading
	//rules
	/*
	 method should be of similar name 
	 change in formal argument
	 	*length
	 	*data type
	 	*order of declaration
	 */
	public static int num(int a, int b)
	{
		return a+b;
	}
	public static int num(int a, int b, int c)
	{
		return a+b+c;
	}
}
