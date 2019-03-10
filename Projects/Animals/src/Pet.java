
public abstract class Pet extends Animal {
	
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name.length() > 0)?name:null;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = (price > 0)?price:0;
	}
	
	@Override
	public String toString() {
		return super.toString()+", name: "+getName() + ", price: "+getPrice();
	}
	
	public Pet() {
		System.out.println("pet constructor");
	}
	
	public abstract void cleanPet(int minutes);
}
