
public class Cube extends Shape3D{

	public Cube(int x) {
		super(x, x);
	}

	@Override
	public double getVolume() {
		return Math.pow(getX(), 3);
	}

	@Override
	public double getArea() {
		return 6*Math.pow(getX(), 2);	
	}
}
