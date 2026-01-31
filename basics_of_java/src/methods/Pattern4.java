package methods;

public class Pattern4 {
	
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=2*n-1;i++)
		{ for(int j=1;j<=2*i-1;j++) {
		if((j<=i || i+j<=2*n) ||  (i+j<=n+1 || j-i>=3*n-1))
		 System.out.print("*");
		else
			System.out.print(" ");
			
	}
		System.out.println();}

}
}

