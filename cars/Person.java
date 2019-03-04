package cars;

public class Person {

	private String name;
	private String id;
	
	private Car ownedCar;
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void driveToWork() {
		System.out.println("Person '" + name + "' is driving to work...");
		ownedCar.startEngine();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Car getOwnedCar() {
		return ownedCar;
	}

	public void setOwnedCar(Car ownedCar) {
		this.ownedCar = ownedCar;
	}
}
