
public class Dog extends Pet
{
	private boolean isExtraBarking;
	private double weight;
	
	public boolean getisExtraBarking() {
		return isExtraBarking;
	}
	public void setExtraBarking(boolean isExtraBarking) {
		this.isExtraBarking = isExtraBarking;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public void setWeight(double weight) {
		this.weight = (weight >0.2 && weight< 30)?weight:0.2;
	}
	
	@Override
	public String makeSound() {
		return "hawwoo hawwoo";
	}
	
	@Override
	public void cleanPet(int minutes) {
		System.out.println("Dat is taking a bath for: "+minutes +" minutes");
	}
	
	@Override
	public String toString() {
		return super.toString()+", isExtraBarking :"+getisExtraBarking();
	}
}
