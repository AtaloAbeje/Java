package Cook;

public class Cookie
{
	private boolean gluten;
	private int eggs;
	private double sugar; //gram
	private double flour; //gram
	
	public int getEggs() {
		return eggs;
	}
	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	public double getSugar() {
		return sugar;
	}
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	public double getFlour() {
		return flour;
	}
	public void setFlour(double flour) {
		this.flour = flour;
	}
	public boolean getisGluten() {
		return gluten;
	}
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
	
	public Cookie(boolean gluten, int eggs, double sugar, double flour) 
	{
		this.gluten = gluten;
		this.eggs = eggs;
		this.sugar = sugar;
		this.flour = flour;
	}
	public Cookie() {}

}
