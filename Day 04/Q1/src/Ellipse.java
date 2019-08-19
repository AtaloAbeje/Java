class Ellipse extends Elliptic{

	
	public Ellipse(int x,int y) {
		super(x,y);
	}
	
	@Override
	public double getCircumference() {
		double num=Math.pow(getX(),2)+Math.pow(getY(),2);
		return Math.PI*(Math.sqrt(num/4));
	}

	@Override
	public double getArea() {
		return (Math.PI / 4)*getX()*getY();
	}

}
