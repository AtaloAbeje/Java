
public abstract class Person 
{
	private int id;
	private String name;
	private boolean isMale;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	
	@Override
	public String toString()
	{
		return "name: " +this.name+", id:" +this.id+", ismale?" + this.isMale;
	}
	
	public abstract void morningAction();
	
	
}
