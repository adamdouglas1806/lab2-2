package people;

public class HWUPerson extends Person{
	private String ID;
	
	public String getID() {
		return ID;
	}
	
	public HWUPerson(String firstName, String surname) {
		super(firstName, surname);
		
		int max = 999;
		int min = 100;
			
		char FLFN = firstName.charAt(0);
		char FLS = surname.charAt(0);
		
		int randomNum = (int)(Math.random()*(max-min)+min);
		
		ID = Character.toString(FLFN) + Character.toString(FLS) + Integer.toString(randomNum);
	}

	public void printInfo() {
		System.out.println("Name: "+this.getFirstName() + ", " + this.getSurname() + " (" + ID + ")");
	}
	
	public String getInfo() {
		String name = super.getInfo() + " ID: "+ID;
		return name;
	}
	
}
