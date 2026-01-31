package string;

public class Program3_Regex {
	
	public static void main(String[] args) {
		System.out.println("d".matches("[abc]"));
		System.out.println("d".matches("[^abc]"));
		System.out.println("m".matches("[a-z]"));
		System.out.println("M".matches("[a-z]"));
		System.out.println("M".matches("[A-Z]"));
		
		System.out.println("abc".matches("[a-z]+"));
		System.out.println("ABC".matches("[A-Z]+"));
		System.out.println("abcABC".matches("[a-zA-Z]+"));
		System.out.println("abcABC".matches("[A-Za-z]+"));
		System.out.println("123".matches("[0-9]+"));
		System.out.println("abc123AZW".matches("[a-zA-Z0-9]+"));
		System.out.println("8".matches("[6-9]"));
		System.out.println("7876543210".matches("[6-9][0-9]+"));
		
		System.out.println("83456".matches("[6-9]\\d+"));
		
		System.out.println("7876543210".matches("[6-9][0-9]{9}"));
		System.out.println("7876543210".matches("[6-9]\\d{9,}"));
		System.out.println("78765432104567".matches("[6-9]\\d{9,12}"));
		
		String s="helloABWX";
		System.out.println(s.matches("\\w+"));
		String s1=" ";
		System.out.println(s1.matches("\\s+"));
		System.out.println("M".matches("\\w{1}"));
		
		String s2="java!W#@qae(";
		String sarr[]=s2.split("[!#(@]");
		String sarr1[]=s2.split("[^a-zA-Z0-9]+");
		for (int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}
		for (int i=0;i<sarr1.length;i++)
		{
			System.out.println(sarr1[i]);
		}
		
		
	}

}

