package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char[] c1=s1.toUpperCase().toCharArray();
		Arrays.sort(c1);
		char[] c2=s2.toUpperCase().toCharArray();
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2)?"They are Anagram":"They are not Anagram");
	}
}
