package Runtime_Polymorphism;

public class Test {

	public static void main(String[] args) {
		Animal a=new Animal();
		
		Lion lion=new Lion();
		lion.sound();
		a.sound();
		
		Dog dog=new Dog();
		dog.sound();
		
		//upcasting
		Animal animal=new Lion();
		animal.sound();
		
		Animal animal2=new Dog();
		animal2.sound();
	}
}
