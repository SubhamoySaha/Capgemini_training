package inheritence.multilevel_inheritence;

public class Developer extends Employee {
	
	String technology;
	
	public Developer(int id, String name, double salary, String technology,int age) {
		super(id,name,salary,age);
		this.technology=technology;
	}
	
	public void displayDeveloper() {
		displayEmp();
		System.out.println(technology);
	}
	
	public static void main(String[] args) {
		Developer d=new Developer(101,"NIl NITIN MUKESH",50000,"SpringBoot",22);
		d.displayDeveloper();
	}}

