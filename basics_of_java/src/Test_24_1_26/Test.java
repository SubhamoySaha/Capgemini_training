package Test_24_1_26;


class ParentPrivate {
    private void display() {
        System.out.print("Parent");
    }

    void call() {
        display();
    }
}

class ChildPrivate extends ParentPrivate {
    private void display() {
        System.out.print("Child");
    }
}
public class Test {
//	   public static void main(String[] args) {
//	        Integer a = 100;
//	        Integer b = 100;
//
//	        System.out.println(a == b);
//	    }
	
	
//    static int x;
//
//    static {
//        x = 10;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(x);
//    }
	
//	 public static void main(String[] args) {
//	        X obj = new Y();
//	        obj.show();
//	    }
	
	public static void main(String[] args) {
        ParentPrivate p = new ChildPrivate();
        p.call();
    }
	
    
}
