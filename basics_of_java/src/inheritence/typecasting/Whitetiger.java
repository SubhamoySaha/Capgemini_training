package inheritence.typecasting;

public class Whitetiger extends Tiger{

	public void Whitecolor() {
		System.out.println("White in Colour");
	}
	public static void main(String[] args) {
		Whitetiger wt=new Whitetiger();
		wt.Whitecolor();
		wt.roar();
		wt.walk();
		
		Tiger tiger=wt;
		
		tiger.roar();
		tiger.walk();
		((Whitetiger)tiger).Whitecolor();
		
		Animal animal=wt;
		
		animal.walk();
		((Tiger)animal).roar(); //Animal animal=new Animal(); Tiger ti=(tiger)animal; tiger.walk(); 
		((Whitetiger)animal).Whitecolor(); 
		
	}
	
}
