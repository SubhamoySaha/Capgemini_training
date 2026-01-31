package Operators.ConditionalOperators;

public class Program1 {

	public static void main(String[] args) {
		{
			//Syntax----> Operand1?Operand2:Operand3 
			
			System.out.println(true?20:30);
			System.out.println(false?30:20);
			System.out.println(10>'A'?true:false);
			System.out.println("HELLO" != "hello"?'A':'B');
			System.out.println(40>30? 'A':'B');
			
			
			String res=40>30?"A":"true";
				System.out.println(res);
		}
	}
}
