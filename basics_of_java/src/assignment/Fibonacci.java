package assignment;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		for(;c<=n;)
		{
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;	
		}
	}
}
