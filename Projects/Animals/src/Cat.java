
public class Cat extends Pet 
{
	private int numOfHuntedSnakes;
	private double weight;
	
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = (weight >= 0.2 && weight <= 30)?weight:0.2;
	}
	
	public int getNumOfHuntedSnakes() {
		return numOfHuntedSnakes;
	}

	public void setNumOfHuntedSnakes(int numOfHuntedSnakes) {
		this.numOfHuntedSnakes = (numOfHuntedSnakes > 0)?numOfHuntedSnakes:0;
	}
	public Cat() {
		System.out.println("Cat constructor");
	}
	
	@Override
	public String toString() {
		return super.toString() +", numOfHuntedSnakes: "+getNumOfHuntedSnakes();
	}
	
	@Override
	public void cleanPet(int minutes) {
		System.out.println("Cat is taking a bath for "+minutes +" minutes");
	}

	@Override
	public String makeSound() {
		return "miawwww miawwww";
	}
	
}
