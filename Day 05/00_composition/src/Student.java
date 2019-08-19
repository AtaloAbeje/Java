
public class Student extends Person{

	private int grade;
	
	public Student(String name, Address address, int grade) {
		super(name, address);
		setGrade(grade);
	}

	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
