
public class Rectangle extends Polygon {

	public Rectangle(int x, int y) {
		super(x, y);
	}

	@Override
	public double getCircumference() {
		return getX()*2+getY()*2;
	}

	@Override
	public double getArea() {
		return getX()*getY();
	}

}
