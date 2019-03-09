package per;

public class Person
{
	private String name;
	private Date birthDate;
	
	private Person dad;
	private Person mom;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}

	public Person getMom() {
		return mom;
	}

	public void setMom(Person mom) {
		this.mom = mom;
	}

	public Person(String name, Date birthDate, Person dad, Person mom) {
		this.name = name;
		this.birthDate = birthDate;
		this.dad = dad;
		this.mom = mom;
	}

	public String print()
	{
		String s = null;
		String res = "Name: "+this.name+", Birth Date: "+this.birthDate + ", Dad: "+this.dad + ", Mom: "+this.mom;
		if(!this.mom.equals(s) && !this.dad.equals(s)) {
			res += this.mom.print()+this.dad.print();
		}
		return res;
	}

}
