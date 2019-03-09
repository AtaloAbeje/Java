package rec;

public class Rectangle
{
	private int iength;
	private int width;

	public int getIength() {
		return iength;
	}
	public void setIength(int iength) {
		if(iength == 0) {
			iength = 10;
		}
		if(iength > 0) {
			this.iength = iength;
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width == 0) {
			width = 10;
		}
	
		if(width > 0) {
			this.width = width;
		}
	}

	public Rectangle(int iength, int width) 
	{
		this.iength = iength;
		this.width = width;
	}
	public Rectangle() {}
	
	public int get_circuit() 
	{
		return (iength*2) + (width*2);
	}
	
	public int get_area() 
	{
		return iength*width;
	}
	
	public int print(String cs) 
	{
		for(int i=0; i< width; i++)
		{
			for(int j=0; j<iength; j++)
			{
				System.out.print(cs);
			}
			System.out.println();
		}
		return (iength*2) + (width*2);
	}
}
