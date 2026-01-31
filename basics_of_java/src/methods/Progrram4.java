package methods;

public class Progrram4 {

	//COMPILE TIME BINDING/STTATIC BINDING/COMPILE TIME POLYMORPHISM/METHOD OVERLOADING
	
	public static void main(String[] args) {
		
		num(1,2);
		//num('A',20) // output: int,int   ..... implicit type casting happens
	}
	
	public static void num(int a,int b)
	{
		Sys
		tem.out.println("int,int");
	}
	
	public static void num(double a,double b)
	{
		//implementation
		System.out.println("double,double");
	}
	
}
