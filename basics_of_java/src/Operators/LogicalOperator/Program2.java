package Operators.LogicalOperator;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(false || true || false);
		int a=6;
		System.out.println(a>10 || ++a>10);
		System.out.println(a);
		
		a=6;
		System.out.println(a<10 || ++a>10); //a<10 is true so the compiler will not move to the ++a>10 part
		System.out.println(a); 
	}
}
