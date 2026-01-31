package association;

public class Test {
	public static void main(String[] args) {
			
		Car c=new Car();
//		c.setBrand("A");
//		c.setPrice(20000000);
		
		
		System.out.println(c.getEngine());
		Engine e=c.getEngine();
		System.out.println(e);
	}
}
