
public class Pizza {
	
	// every object needs an own property
	private String topping;
	
	//this property is class-level
	private static int counter=0;
	
	public Pizza(String topping) {
		this.topping = topping;
		Pizza.counter++;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public static int getCounter() {
		return counter;
	}

}
