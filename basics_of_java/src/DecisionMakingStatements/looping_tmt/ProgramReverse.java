package DecisionMakingStatements.looping_tmt;

public class ProgramReverse {
	
	public static void main(String[] args) {
		
		int num=1863;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		System.out.println("Reverse= "+rev);
	}

}
