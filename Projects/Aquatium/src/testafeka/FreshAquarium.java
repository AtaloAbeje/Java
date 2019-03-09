package testafeka;

public class FreshAquarium extends Aquatium
{
	private int FreshRating;

	public int getFreshRating() {
		return FreshRating;
	}

	public void setFreshRating(int freshRating) {
		FreshRating = freshRating;
	}

	public FreshAquarium(int size, int year, int rating, String model, int ratingWater) 
	{
		super(size, year, rating, model);
		FreshRating = ratingWater;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "FreshRating" + this.FreshRating;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof FreshAquarium)
		{
			FreshAquarium fresh = (FreshAquarium)obj;	
			return FreshRating == fresh.getSize();
		}
		return false;
	}
}