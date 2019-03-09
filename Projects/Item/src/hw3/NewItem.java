package hw3;

public class NewItem
{
	private Item Product;
	private int Bonus;
	
	public NewItem(Item product, int bonus) 
	{
		Product = product;
		Bonus = bonus;
	}
	public void setBonus(int B) //B=number of bonus
	{
		this.Bonus = B;
	}
	
	public float Cost(int N)
	{
		float res;
		if(N<=100)
			return Product.Cost(N);
		res=Product.Cost(N-100)*(1-(float) Bonus/100);
		res+=Product.Cost(100);
		
		return res;
	}
	
	
	
}