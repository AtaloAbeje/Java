// הורשה
public class Student extends Person {

	public Student() {
		super();
		System.out.println("Student");
	}
	
	/*
	 * public Student(String name, int age, Address address) { super(name, age,
	 * address); }
	 */

	// ------------- Properties -----------------
	private int grade;

	// -------------Getter + Setter -------------

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// -----------------Methods--------------------
	@Override
	public String getDescription() {
		return super.getDescription() + " , grade: " + grade;
	}
	

}
