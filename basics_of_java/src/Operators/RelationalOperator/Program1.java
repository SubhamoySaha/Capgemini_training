package Operators.RelationalOperator;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(10>20);
		boolean res=20>10;
		System.out.println(res);
		
		boolean res2='a'<'A';
		System.out.println(res2);
	
		boolean res3=7<'A';
		System.out.println(res3);
		
		
		//"A"---> hash code---> hashfunction but it is only supported in == and !=
		boolean res4="A"=="B";
		System.out.println(res4); //false
		
		boolean res5="A"!="B";
		System.out.println(res5); //true
		
		/*boolean res4="A">="B"; //this gives error
		System.out.println(res4);*/
		
		//>,<,>=,<=,== byte, short,int,long
		//String, boolean --> ==,!=
	}
}
