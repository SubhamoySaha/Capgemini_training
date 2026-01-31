package string;
import java.util.*;

public class ValidMail {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mail=sc.next();
		System.out.println((mail.matches("[a-z][a-z0-9._]+@[a-z.]+"))?"Valid Mail":"Invalid Mail");
		
		
	}

}
