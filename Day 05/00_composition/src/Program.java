
public class Program {

	public static void main(String[] args) {
		Address a=new Address("TLV");
		Student s=new Student("Bob",a,100);
		
		System.out.println("name: "+s.getName());
		
		
		System.out.println("city: "+s.getAddress().getCity());

	}

}
