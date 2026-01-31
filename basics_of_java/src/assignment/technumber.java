package assignment;

public class technumber {

	public static void main(String[] args) {
		int n=2025, mid;
		int temp=n,count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		if(count%2==0)
		{
			mid=(int)Math.pow(10,(count/2));
			int sum=(temp%mid)+(temp/mid);
			if(sum*sum==temp)
				System.out.println("Tech number");
			else
				System.out.println("Not a tech number");
		}
		else
		{
			System.out.println("Not a tech number");
		}
	}
}
