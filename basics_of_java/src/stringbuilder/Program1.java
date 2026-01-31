package stringbuilder;

public class Program1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());	
		System.out.println(sb.length());
		sb.append("12345678901234512");
		System.out.println(sb.capacity());	
		sb.append("12345678901234512qwertyuiopasdfghjklzxcvbnm,");
		System.out.println(sb.capacity());
	}
}
