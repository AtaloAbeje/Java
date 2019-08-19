
public class SoftDrink extends Food 
	implements Drinkable<Integer> {

	@Override
	public Integer isReady() {
		return 4;
	}

}
