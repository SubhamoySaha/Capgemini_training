package Operators.ArithmeticOperators;

public class Program1 {
	//Arithmetic Operator
	public static void main(String[] args) {
		//Addition
		//normal, Concatenation
		int a=10, b=30;
		
		System.out.println(10+20);
		System.out.println(a+b);
		System.out.println(""+10+20); //output: 1020 //concatenation
		System.out.println(10+20+"Hello"+10+20); //output: 30Hello1020
		System.out.println(10+30*2); //output: 70
		System.out.println(5/2); //output:2 because both of type 'int'
		System.out.println(5/2.0); //output:2.5 int/double--->double	
		System.out.println('A'+'B'); //output: 131
		char c='A'+7;
		System.out.println(c); //output: H (65+7=72=H)
		c='A'+'7';
		System.out.println(c);  //output: 65+55 (65+55=120=x)
	} 
}
