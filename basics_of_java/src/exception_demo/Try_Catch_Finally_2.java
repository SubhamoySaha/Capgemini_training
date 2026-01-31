package exception_demo;

public class Try_Catch_Finally_2 {
	
	public static int method() {
		try {
			return 10/2;
			
		}
		
		catch(ArithmeticException e) {
			return  -1;
		}
		
		finally {
			return 100;
		}
	}

}
