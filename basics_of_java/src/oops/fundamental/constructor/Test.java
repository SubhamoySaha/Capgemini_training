package oops.fundamental.constructor;

public class Test {
	
	public static void main(String[] args) {
		
		Student ob1=new Student(1,"A",80);
//		Student ob1=new Student(); //This line gives error as the compiler finds for the parameterised constructor
//		ob1.id=1;
//		ob1.name="A";
//		ob1.per=80;
		
		Student ob2=new Student(2,"B",90);
		Student ob3=new Student(3,"C",85);
		
		System.out.println("ID\tName\tPercentage");
		
		ob1.display();
		ob2.display();
		ob3.display();
	}
}
