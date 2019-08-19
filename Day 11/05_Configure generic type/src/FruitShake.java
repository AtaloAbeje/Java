
public class FruitShake extends Food 
		implements Drinkable<FruitShake> {

	@Override
	public FruitShake isReady() {
		return this;
	}

}
