
public class App {

	public static void main(String[] args) {
		Person p1=new Person("Bob",20, new Address("Ariel","Israel"));
		Person p2=new Person("Alice",21, new Address("TLV","Israel"));
		
		System.out.println(p1.getDescription());
		System.out.println(p2.getDescription());
		
		
		//first way to change a property in a composition property
		Address bobAddress=p1.getAddress();
		bobAddress.setCity("Jerusalem");
		System.out.println(p1.getDescription());
		
		
		//second way to change a property in a composition property
		p1.getAddress().setCity("Hod Hasharon");
		System.out.println(p1.getDescription());

		// פולימורפיזם = רב צורתיות
		// every var can point to the objects of the class type of the var
		// or of objects that inherit from the class type of the var
		Student s=new Student();
		System.out.println(s.getDescription());
		
		System.out.println(s.getAge());
		//down casting
		if(s instanceof Student) {
		    System.out.println(((Student)s).getGrade());
		}
	}

}
