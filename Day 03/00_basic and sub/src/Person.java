
public class Person{
	
	public Person() {
		System.out.println("Person");
	}
	
	public Person(String name, int age,Address address ) {
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
	}

	
	//------------- Properties -----------------
	// Encapsulation (הכמסה)
	private String name;
	private int age;
	private Address address=new Address("Default","Default");
	
	
	//-------------Getter + Setter -------------
    public int getAge() {
		return age;
	}
    
    public void setAge(int age) {
		this.age = (age>0 && age<=120) ? age:0;
	}
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	//-----------------Methods--------------------
	protected String getDescription() {
		return name+" is "+age + " years old , Address"+address.getDescription();
	}

	

	
}
