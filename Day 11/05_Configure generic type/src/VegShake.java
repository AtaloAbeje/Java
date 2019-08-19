
public class VegShake extends Food implements Drinkable<VegShake> {

	@Override
	public VegShake isReady() {
		return this;
	}

}