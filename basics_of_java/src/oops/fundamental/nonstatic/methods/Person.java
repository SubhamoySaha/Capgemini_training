package oops.fundamental.nonstatic.methods;

public class Person {
	
	String name;
	int  age;
	String gender;

	public void display()
	{
//		//System.out.println("this:"+this);
//		person1:oops.fundamental.nonstatic.methods.Person@4517d9a3
//		this:oops.fundamental.nonstatic.methods.Person@4517d9a3
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
	
	public void initialize(String name, int age,String gender) {
		//Person ob=new Person();
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}
