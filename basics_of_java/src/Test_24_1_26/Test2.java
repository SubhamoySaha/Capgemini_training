package Test_24_1_26;

class ParentStatic {
    static void display() {
        System.out.print("Parent");
    }
}

class ChildStatic extends ParentStatic {
    static void display() {
        System.out.print("Child");
    }
}

public class Test2 {

	  public static void main(String[] args) {
	        ParentStatic p = new ChildStatic();
	        p.display();
	    }
	
}
