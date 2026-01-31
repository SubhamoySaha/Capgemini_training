package DecisionMakingStatements.looping_tmt;

public class automorphic {

	public static void main(String[] args) {
		
		int num=5; int temp=num;
		int square=num*num; int div=1;
		while(num!=0)
		{
			div=div*10;
			num=num/10;
		}
		if(square%div==temp)
			System.out.println("Automorphic");
		else
			System.out.println("Not an autumorphic number");
	}
}
