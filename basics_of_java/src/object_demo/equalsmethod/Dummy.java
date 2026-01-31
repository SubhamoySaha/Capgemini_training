package object_demo.equalsmethod;

public class Dummy {

	public static void main(String[] args) {
		int a=10,b=10;
		
		Dummy d1=new Dummy();
		Dummy d2=new Dummy();
		
		System.out.println(a==b);
		System.out.println(d1==d2);
		
		System.out.println(d1.equals(d2));
	}
}
