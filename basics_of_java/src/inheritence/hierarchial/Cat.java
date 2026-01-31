package inheritence.hierarchial;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	public void meow() {
		System.out.println(name + " says Ahh");
	}

	public static void main(String[] args) {
		Cat c = new Cat("Pussy");
		c.eat();
		c.meow();
	}
}
