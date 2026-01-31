package assignment;
import java.util.*;
public class sumntom {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println("Enter m: ");
		int m=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				sum1+=i;
			}
			else
			{
				sum2+=i;
			}		
		}
		System.out.println(sum2-sum1);
	}

}
