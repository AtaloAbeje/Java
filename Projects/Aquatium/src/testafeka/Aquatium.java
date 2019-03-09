package testafeka;

public class Aquatium 
{
	private int Size;
	private int Year;
	private int Rating;
	private String Model;
	
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		if(size >=0)		
			Size = size;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		if(year >=0)
			Year = year;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Aquatium(int size, int year, int rating, String model)
	{
		this.Size = size;
		this.Year = year;
		this.Rating = rating;
		this.Model = model;
	}
	
	public boolean isLonger(int x)
	{
		if(this.Size > x)
			return true;
		else
			return false;			
	}
	
	public String toString() 
	{
		return "Size:"+this.Size +", Year:" + this.Year + ", Rating:" + Rating +", Model: " + Model;
	}
}
