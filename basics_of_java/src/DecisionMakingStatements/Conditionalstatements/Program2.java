package DecisionMakingStatements.Conditionalstatements;

public class Program2 {

	public static void main(String[] args) {
		//special 2 digit number
		//29--->2+9 + 2*9 ---> 11+18=29
		
		int num=29;
		int temp=num;
		int last=num%10;
		int first=num/10;
		int sum=last+first;
		int prod=last*first;
		if(prod+sum==temp)
			System.out.println("Special 2 digit number");
		else
			System.out.println("Not a special 2 digit number");
	}
}
