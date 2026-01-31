package Operators.LogicalOperator;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(true && false && true);
		int a=5;
		System.out.println(a>10 && ++a>a); //a>10 is false so the compiler will not move to the ++a>a part
		System.out.println(a);
		
		System.out.println(a<10 && ++a>a);
		System.out.println(a);
	}
}
