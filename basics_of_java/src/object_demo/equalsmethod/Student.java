package object_demo.equalsmethod;


public class Student {
	int id;
	String name ;
	double percentage;

	public Student(int id , String name, double percentage) {
	this.id = id;
	this. name = name;
	this.percentage = percentage;
	}
	
	public boolean equals(Object o) 
	
	/* SYNTAX OF equals()
	 
	 public boolean equals(Object obj) {
        return (this == obj);
    }
    
	 */
	
	{
		
		Employee s = (Employee)o;
		
		if(this.id == s.id && this.name.equals(s.name)) //this.id=s1 and s is s2
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sourab", 80.0);
		Employee s2 = new Employee(2,"Sourab", 80.0);
		
		
		System.out.println(s1.equals(s2));
	}
}
