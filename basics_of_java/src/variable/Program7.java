package variable;

public class Program7 {

	public static void main(String args[])
	{
		byte b=(byte)128;
		System.out.println(b); //output:-128
		b=(byte)129;
		System.out.println(b); //output:-127
		
		//In this type of cases when something out of range is type casted the next cyclic value is assigned
		
		int j=1_00_0;
		System.out.println(j); //output: 1000
		
		int k=1_4;
		System.out.println(k); //output: 14
		
		//_ are ignored
		
	}
}
