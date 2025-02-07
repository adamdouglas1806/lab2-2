package people;

public class HWUStaff extends HWUPerson{

	private static String[] offices = {"EMG.12", "EMG.13", "EMG.14", "EMG.15", "EM1.23", "EM1.24", "EM1.25", "EM1.26", "EM2.34", "EM2.35", "EM2.36", "EM2.37"};
	
	private String officeAllocate;
	
	public HWUStaff(String firstName, String surname) {
		super(firstName, surname);
		
		int randomNum = (int)(Math.random()*12);
		officeAllocate = offices[randomNum];
	}
	
	public String getOfficeAllocate() {
		return officeAllocate;
	}
	
	public String getInfo() {
		String officeName = super.getInfo()+" Office: "+officeAllocate;
		return officeName;
	}
	
}
