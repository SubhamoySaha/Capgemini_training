package DecisionMakingStatements.looping_tmt;

public class NeonNumber {

	 public static void main(String[] args) {
		
		 int num=9;
		 int sq=num*num;
		 int sum=0;
		 while(sq>0) {
			 sum=sum+sq%10;
			 sq=sq/10;
		 }
		 if(sum==num)
			 System.out.println("Neon Number");
		 else
			 System.out.println("Not a Neon Number");
	 }
}
