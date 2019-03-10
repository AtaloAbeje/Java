
public class Bird extends Animal {
	
	private double weight;
	private boolean isFlying;
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Override
	public void setWeight(double weight) {
		this.weight = (weight > 0.2 && weight <10)?weight:0.2;	
	}
	
	
	public boolean getIsFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	public Bird() {
		System.out.println("Bird constructor");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", isFlying:" +getIsFlying();
	}
	
	@Override
	public String makeSound() {
		return "Ziffff Ziffff";
	}
}
