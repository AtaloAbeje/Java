
public class Sphere extends Shape3D{
	public Sphere(int x) {
		super(x, x);
	}

	@Override
	public double getVolume() {
		return (4.0/3)*Math.PI*Math.pow(getX(), 3);
	}

	@Override
	public double getArea() {
		return 4*Math.PI*Math.pow(getX(), 2);
	}
}
