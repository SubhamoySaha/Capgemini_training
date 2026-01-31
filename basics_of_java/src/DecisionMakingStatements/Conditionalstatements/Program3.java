package DecisionMakingStatements.Conditionalstatements;

public class Program3 {

	public static void main(String[] args) {
		byte b=1;
		switch(b)
		{//byte, short, int, char, string are the accepted data types that are allowed for input
		
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
			default:
				System.out.println("Default"); /*Default block can be placed anywhere in the program, not mandatorily in
				last, it can be added in front or middle also*/
		}
	}
}
