package cars;

public class Car {

	private String licensePlate;
	private String manufacturer;
	private int currentSpeed;
	private int topSpeed;
	private int yearOfMake;
	private Color color;
	private Person owner;
	
	public Car(String licensePlate, String manufacturer, int yearOfMake, Color color) {
		this.licensePlate = licensePlate;
		this.manufacturer = manufacturer;
		this.yearOfMake = yearOfMake;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println("Car " + licensePlate + " (" + manufacturer + " " + yearOfMake + ") started engine");
	}
	
	public void stopEngine() {
		System.out.println("Car " + licensePlate + " shut down engine");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}
