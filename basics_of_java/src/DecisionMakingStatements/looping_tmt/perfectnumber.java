package DecisionMakingStatements.looping_tmt;

public class perfectnumber {

	public static void main(String[] args) {
		int num=28;
		int i=1;
		int sum=0;
		int temp=num;
		while(i<num)
		{
			if(num%i==0)
			{
				sum+=i;
			}
			i++;
		}
		if(sum==temp)
			System.out.println("Special number");
		else
			System.out.println("not a Special number");
	}
}
