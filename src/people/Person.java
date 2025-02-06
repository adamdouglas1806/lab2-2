package people;

public class Person {
	
	private String firstName;
	private String surname;
	private String name;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void printInfo() {
		System.out.println("Name: " + firstName + ", " + surname);
	}
	
	public Person(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public String getInfo() {
		String name = "Name: "+firstName+" "+surname;
		return name;
	}
	
	public void displayInfo() {
		System.out.println(getInfo());
	}
	
}
