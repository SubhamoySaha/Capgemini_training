package methods;

public class StrongNumber {

	public static int factorial(int n) {
		int prod = 1;
		for (int i = 1; i <= n; i++) {
			prod *= i;
		}

		return prod;
	}

	public static void main(String[] args) {
		int n = 145, temp = n, sum = 0;
		while (n > 0) { // ddddvd dvdcsc fffff
			sum += factorial(n % 10);
			n /= 10;
		}
		if (sum == temp)
			System.out.println("It is Strong Number");
		else
			System.out.println("it is not a strong number");
	}
}
