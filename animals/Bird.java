package animals;

public class Bird extends Animal {

	public Bird(String name) {
		super(name);
		System.out.println("Inside Bird class constructor");
	}
	
	public void fly() {
		System.out.println("Bird '" + name + "' is flying");
	}
}
