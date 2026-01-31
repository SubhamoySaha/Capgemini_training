package assignment;

public class armstrong {

	public static void main(String[] args) {
		int n=153, temp=n, c=temp, sum=0, count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		while(temp>0)
		{
			sum+=Math.pow((temp%10),count);
			temp=temp/10;
		}
		if(sum==c)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
