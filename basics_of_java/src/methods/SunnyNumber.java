package methods;

public class SunnyNumber {

	public static boolean sunny(int n)
	{
		int c=(int)Math.sqrt(n+1);
		if(n>0 && c*c==n+1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int n=3;
		if(sunny(n))
		System.out.println("It is a Sunny number");
		else
			System.out.println("It is not a Sunny number");
		
	}
}
