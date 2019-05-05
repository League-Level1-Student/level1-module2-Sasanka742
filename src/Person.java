
public class Person {
	private String name;
	private String power;
	public Person(String name, String power) {
		this.name = name;
		this.power = power;
	}
	private String getName() {
		return name;
	}
	
	private String getPower() {
		return power;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	private void setPower(String power) {
		this.power = power;
	}
	
	public String toString() {
		return name + " has many "+power+" skills.";
	}
	
}
