package animals;

public class ZooSimulator {

	public static void main(String[] args) {
		
		System.out.println("Inside ZooSimulator class constructor");
		
		Bird bird = new Bird("Tweety");
		System.out.println("Bird's name: " + bird.getName());
		bird.fly();
		
	}
}
/*
Inside ZooSimulator class constructor
Inside Animal class constructor
Inside Bird class constructor
Bird's name: Tweety
Bird 'Tweety' is flying

*/