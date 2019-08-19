import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(12,"Alice"));
		list.add(new Student(10,"Bob"));
		list.add(new Student(7,"Dan"));
		
		//--> [Alice is 12 years old, Bob is 10 years old, Dan is 7 years old]
		System.out.println(list);
		
		list.sort(null);
		
		//--> [Dan is 7 years old, Bob is 10 years old, Alice is 12 years old]
		System.out.println(list);
		
		list.sort(new NameSort());
		
		
		//--> [Alice is 12 years old, Bob is 10 years old, Dan is 7 years old]
		System.out.println(list);
		
	}

}
