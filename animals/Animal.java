package animals;

public class Animal {

	protected String name;
	private boolean isAlive;
	private boolean isHungry;

	public Animal(String name) {
		this.name = name;
		
		System.out.println("Inside Animal class constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
}
