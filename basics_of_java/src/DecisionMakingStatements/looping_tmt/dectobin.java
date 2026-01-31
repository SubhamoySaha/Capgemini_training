package DecisionMakingStatements.looping_tmt;

public class dectobin {

	public static void main(String[] args) {
		int num=10;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%2;
			num=num/2;
		}
		System.out.println(rev);
	}
}
