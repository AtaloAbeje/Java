
public class Triangle90dg extends Polygon {

	public Triangle90dg(int x, int y) {
		super(x, y);
	}

	@Override
	public double getCircumference() {
		double num=Math.pow(getX(),2)+Math.pow(getY(),2);
		return getX()+getY()+(Math.sqrt(num));
	}

	@Override
	public double getArea() {
		return  (getX()*getY())/2;
	}

}
