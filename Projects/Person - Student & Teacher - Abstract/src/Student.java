
public class Student extends Person
{
	private String schoolName;
	private double gradesAvg;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public double getGradesAvg() {
		return gradesAvg;
	}
	public void setGradesAvg(double gradesAvg) {
		this.gradesAvg = (gradesAvg >=0 && gradesAvg <=100)?gradesAvg:0;
	}
	
	@Override
	public String toString() {
		return super.toString() +", schoolName: "+schoolName+", gradesAvg: "+gradesAvg;
	}
	
	@Override
	public void morningAction() {
		System.out.println("Student action");
	}
	
	public void StudentTest() {
		System.out.println("Student start Test");
	}
}
