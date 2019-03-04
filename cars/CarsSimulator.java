package cars;

public class CarsSimulator {

	public static void main(String[] args) {

		Car car1 = new Car("99-234-56", "Toyota", 1989, Color.BLUE);
		Car car2 = new Car("11-234-56", "Toyota", 2009, Color.RED);
		
		Person person1 = new Person("Rony", "123456");
		
		person1.setOwnedCar(car1);
		person1.driveToWork();
	}
}
