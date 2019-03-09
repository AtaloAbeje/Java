package testafeka;

public class SaltAquarium extends Aquatium
{
	private char SaltRating;
	
	public char getSaltRating() {
		return SaltRating;
	}
	public void setSaltRating(char saltRating) {
		SaltRating = saltRating;
	}
	
	public SaltAquarium(int size, int year, int rating, String model, char saltRating)
	{
		super(size, year, rating, model);
		this.SaltRating = saltRating;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"SaltRating: "+SaltRating;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof SaltAquarium)
		{
			SaltAquarium salt = (SaltAquarium)obj;
			return SaltRating == salt.getSaltRating();		
		}
		return false;
	}
}
