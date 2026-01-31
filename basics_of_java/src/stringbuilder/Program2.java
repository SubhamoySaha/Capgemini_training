package stringbuilder;

public class Program2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("123");
		System.out.println(sb);
		System.out.println(sb.capacity()); //output: 21 ... default capacity + length of the argument passed in Sconstructor
	}
}
