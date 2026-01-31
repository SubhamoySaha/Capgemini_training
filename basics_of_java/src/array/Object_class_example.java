package array;

public class Object_class_example {

	public static void main(String[] args) {
		
		Object[] a= {30,20.4,"Hello",new Student(),null,false};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
