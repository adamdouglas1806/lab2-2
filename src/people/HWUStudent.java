package people;

public class HWUStudent extends HWUPerson{

		private int yearOfStudy;
		private String HNumber;
		
		public String getHNumber() {
			return HNumber;
		}
		
		public HWUStudent(String firstName, String surname, int yearOfStudy) {
			super(firstName, surname);
			
			this.yearOfStudy = yearOfStudy;
			
			int min = 10000000;
			int max = 99999999;
			
			int randomNum = (int)(Math.random()*(max-min)+min);
			HNumber = "H" + randomNum;
		}
	
		public int getYearOfStudy() {
			return yearOfStudy;
		}
		
		public void setYearOfStudy(int yearOfStudy) {
			this.yearOfStudy = yearOfStudy;
		}
	
	public String getInfo() {
		String Hname = super.getInfo()+" H-number: "+HNumber;
		return Hname;
	}
	
}
