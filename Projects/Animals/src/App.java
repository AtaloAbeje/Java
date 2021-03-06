
public class App 
{
	public static void makeAnimalSound(Animal animal) {
		String animalType;
		if(animal instanceof Pet) {
			animalType = "Pet: "+((animal instanceof Dog)?"dog":"Cat");
		}
		else {
			animalType = "Birt";
		}
		System.out.println(animalType +" maks this sound: "+animal.makeSound());
	}
	public static void main(String[] args) 
	{
		Animal[] animalArray = new Animal[3];
		
		System.out.println("---------------Creating new Dog-----------------");
		animalArray[0] = new Dog();

		System.out.println("---------------Creating new Cat-----------------");
		animalArray[1] = new Cat();
		
		
		System.out.println("---------------Creating new Bird-----------------");
		animalArray[2] = new Bird();
		
		System.out.println("---------------Now make sounds-----------------");
	
		for(Animal i: animalArray){
			makeAnimalSound(i);
		}
	}

}
