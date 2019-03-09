package hm2;
import java.util.Scanner;

public class Shop 
{
	Scanner in = new Scanner(System.in);
	
	String Name;
	Double Banana;
	Double Apple;
	Double Orange;
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if(name.length() <= 15)
			Name = name;
	}

	public Double getBanana() {
		return Banana;
	}

	public void setBanana(Double banana) {
		Banana = banana;
	}

	public Double getApple() {
		return Apple;
	}

	public void setApple(Double apple) {
		Apple = apple;
	}

	public Double getOrange() {
		return Orange;
	}

	public void setOrange(Double orange) {
		Orange = orange;
	}

	public Shop(String name, double bnana, double apple, double orange) {
		Name = name;
		Banana = bnana;
		Apple = apple;
		Orange = orange;
	}
	
	public Shop() 
	{
		this.Name = null;
		this.Banana = 0.0;
		this.Apple = 0.0;
		this.Orange = 0.0;
	}
	
	public void Print()
	{
		System.out.println("Shop: "+Name+" "+"Bnana: "+Banana+" "+ "Apple: "+Apple+" "+ "Orange"+Orange);
	}
}
