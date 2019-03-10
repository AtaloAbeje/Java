
public class App {

	public static void main(String[] args) 
	{

		Person[] personArr = new Person[4];
		
		personArr[0] = new Student();
		personArr[1] = new Teacher();
		personArr[2] = new Student();
		personArr[1] = new Teacher();
		
		// Cannot instantiate the type Person (Person is abstract)
		// personList[0] = new Person();

		for(Person p : personArr)
		{
			System.out.println(p.toString());
			p.morningAction();
			
			if(p instanceof Student) {
				System.out.println(p.toString());
				p.morningAction();
				((Student)p).StudentTest();
			}
			
			else if(p instanceof Teacher) {
				((Teacher)p).getTeachingSubject();	
				}
			
			System.out.println("--------------------------");
		}
	}

}