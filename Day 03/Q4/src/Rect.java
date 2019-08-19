
public class Rect extends Shape{

	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	private double width;
	private double height;
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*height+2*width;
	}

}
