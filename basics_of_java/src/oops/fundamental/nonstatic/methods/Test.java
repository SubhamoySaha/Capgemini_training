package oops.fundamental.nonstatic.methods;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		
//		person1.name = "A";
//		person1.age = 20;
//		person1.gender = "Male";
		//System.out.println("person1:"+person1);
//		person1:oops.fundamental.nonstatic.methods.Person@4517d9a3
//		this:oops.fundamental.nonstatic.methods.Person@4517d9a3

		person1.initialize("A", 21, "Male");
//		System.out.println(person1.name);
//		System.out.println(person1.age);
//		System.out.println(person1.gender); //to avoid writing these lines for multiple objects we have created display() method in person class
		Person person2 = new Person();
		person2.name = "B";
		person2.age = 21;
		person2.gender = "Female";

		person1.display();
		person2.display();
	}
}
