package people;
import java.util.ArrayList;

public class Course {

	private String title;
	private int year;
	HWUStaff courseLeader;
	ArrayList<HWUStudent> students = new ArrayList<HWUStudent>();
	ArrayList<HWUPerson> observers = new ArrayList<HWUPerson>();
	
	public HWUStaff getCourseLeader() {
		return courseLeader;
	}
	
	public void setCourseLeader(HWUStaff courseLeader) {
		this.courseLeader = courseLeader;
	}
	
	public Course(HWUStaff courseLeader, String title, int year) {
		this.courseLeader = courseLeader;
		this.title = title;
		this.year = year;
	}
	
	public void addStudent(HWUStudent student) {
		if (year==student.getYearOfStudy()) {
			students.add(student);
		}else {
			observers.add(student);
		}
	}
	
	public boolean removeStudent(String HNumber) {
		for (HWUStudent student : students) {
			if (student.getHNumber()==HNumber) {
				students.remove(student);
				return true;
			}
		}
		return false;
	}
	
	public void addObserver(HWUPerson observer) {
		observers.add(observer);
	}
	
	public void printSummary() {
		System.out.println("Course: "+title+" ("+year+")");
		System.out.println("Course Leader: "+courseLeader.getFirstName()+" "+courseLeader.getSurname()+" ("+courseLeader.getOfficeAllocate()+")");
		System.out.print("Students: ");
		for (int i=0; i<=students.size()-1; i++) {
			System.out.print(students.get(i).getHNumber()+" ");
		}
		System.out.println("");
		System.out.print("Observers: ");
		for (int j=0; j<=observers.size()-1; j++) {
			System.out.print(observers.get(j).getID()+" ");
		}
		
	}
	
}
