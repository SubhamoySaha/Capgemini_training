package variable;

public class Program5 {

	public static void main(String[] args)
	{
		byte b=20; //1 byte
		int b1=b; // 4 byte
		
		System.out.println(b1);
		
		int i1=30; //4 byte
		byte i2=i1; //1 byte
		
		System.out.println(i2);
	}
}
