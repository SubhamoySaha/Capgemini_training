package inheritence.multilevel_inheritence;

public class Person {

	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void displayPerson()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
