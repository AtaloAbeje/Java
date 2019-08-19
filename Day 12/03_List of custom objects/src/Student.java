
public class Student implements Comparable<Student>{
	public int age;
	public String name;
	
	
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return name+" is "+age +" years old";
	}
	
	
	/*
	 * 0 => two objects are equal
	 * pos => current is greater than second
	 * neg => current is less than second
	 * */
	@Override
	public int compareTo(Student s) {	
		return age-s.age;
	}
}
