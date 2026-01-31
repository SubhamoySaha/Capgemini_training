package Abstraction_oops.onlinecourse;

public class Course {

	String name;
	public Course(String name) {
		this.name=name;
	}
	
	public void CourseInfo() {
		System.out.println("Name of the course: "+name);
	}
}
