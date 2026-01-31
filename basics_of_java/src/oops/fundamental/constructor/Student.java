package oops.fundamental.constructor;

public class Student {

	int id; double per; String name;
	Student(int id, String name, double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public void display()
	{
		System.out.println(id+"\t"+name+"\t"+per);
	}
}
