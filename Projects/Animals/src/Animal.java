
public abstract class Animal 
{
	private int age;
	private String color;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (age >= 0 && age <= 100)?age:0;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = (color.length() > 0)?color:null;
	}
	
	public Animal() {
		System.out.println("Animal constructor");
	}
	
	public abstract double getWeight();
	public abstract void setWeight(double weight);
	
	@Override
	public String toString() {
		return "age: " +getAge() +", color: "+getColor() + ", weight:" + getWeight();
	}
	
	public abstract String makeSound();
}
