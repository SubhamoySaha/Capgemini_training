package array;

public class Program2 {
public static void main(String[] args) {
	Student arr[]=new Student[5];
	Student ob1=new Student(1,"A",80);
	Student ob2=new Student(2,"B",85);
	Student ob3=new Student(3,"C",90);
	arr[0]=ob1;
	arr[1]=ob2;
	arr[2]=ob3;
	
//	for(int i=0;i<5;i++) //NULL POINTER EXCEPTION
//	{
//		System.out.println(arr[i]);
//		arr[i].display();
//	}
	
//	array.Student@1b28cdfa
//	2	B	85.0
//	array.Student@eed1f14
//	3	C	90.0
//	null
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "array.Student.display()" because "arr[i]" is null
//		at array.Program2.main(Program2.java:16)
	
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
		arr[i].display();
	}
}
}
