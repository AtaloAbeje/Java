package hw3;

public class Item
{
	private long Catalog;
	private String Name;
	private float Price;
	
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		if(price >=0)
			Price = price;
	}
	public long getCatalog() {
		return Catalog;
	}
	public String getName() {
		return Name;
	}
	public Item(long catalog, String n, float price) 
	{
		Catalog = catalog;
		Name = n;
		Price = price;
	}
	public Item() 
	{
		Catalog = 0;
		Name = null;
		Price = 0;
	}
	
	public void print()
	{
		System.out.println("Catalog:"+Catalog+", Name:"+Name+"Price: "+Price);
	}
	
	public float Cost(int N) // number of orders
	{
		return N*this.Price;
	}
	
	
}
