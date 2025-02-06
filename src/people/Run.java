package people;
import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		// STEP 1 - Add the appropriate code in the other files
		

		// STEP 2a - Leave the print statement for ease of marking
		System.out.println("Step 2a:");
		// YOUR STEP 2a CODE GOES HERE!
		
		Person Albert = new Person("Albert", "einstein");
		Person Isaac = new Person("Isaac", "Newton");
		
		HWUPerson Pythagoras = new HWUPerson("Pythagoras", "Smith");
		HWUPerson Stephen = new HWUPerson("Stephen", "Hawking");
		
		ArrayList<Person> names = new ArrayList<>();
		
		names.add(Albert);
		names.add(Isaac);
		names.add(Pythagoras);
		names.add(Stephen);
		
		for (int i=0; i<=names.size()-1; i++) {
			names.get(i).printInfo();
		}
				
		// STEP 2b - Leave the print statement for ease of marking
		System.out.println("");
		System.out.println("Step 2b:");
		// YOUR STEP 2b CODE GOES HERE!
		
		HWUStaff LeBron = new HWUStaff("Lebron", "James");
		HWUStudent Michael = new HWUStudent("Michael", "Jordan", 3);
		
		names.add(LeBron);
		names.add(Michael);
		
		for (int i=0; i<=names.size()-1; i++) {
			names.get(i).displayInfo();
		}
		
		// STEP 3 - Leave the print statement for ease of marking
		System.out.println("");
		System.out.println("Step 3:");
		// YOUR STEP 3 CODE GOES HERE!
		
		HWUStaff staffMember = new HWUStaff("Bob", "Brown");
		
		Course courseOne = new Course(staffMember, "Computing Science", 4);
		
		courseOne.addObserver(new HWUStaff("Devin", "Black"));
		courseOne.addStudent(new HWUStudent("Eric", "Allan", 4));
		courseOne.addStudent(new HWUStudent("Shaquille", "O'Neil", 4));
		
		Course courseTwo = new Course(new HWUStaff("Oliver", "Green"), "Math", 3);
		
		courseTwo.addObserver(new HWUStaff("Tom", "Track"));
		courseTwo.addStudent(new HWUStudent("James", "God", 3));
		courseOne.addStudent(new HWUStudent("Tim", "Johnston", 1));
		
		courseOne.printSummary();
		System.out.println("");
		System.out.println("");
		courseTwo.printSummary();
		
		HWUStudent studentMember = new HWUStudent("Steve", "Apple", 4);
		courseOne.addStudent(studentMember);
		courseOne.removeStudent(studentMember.getHNumber());
		
		courseTwo.addObserver(new HWUStaff("Lucas", "Gold"));
		
		System.out.println("");
		System.out.println("");
		courseOne.printSummary();
		System.out.println("");
		System.out.println("");
		courseTwo.printSummary();
		
	}

}