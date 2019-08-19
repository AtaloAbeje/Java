abstract class Shape3D extends Shape{
    public Shape3D(int x, int y) {
		super(x, y);
	}
    
    abstract public double getVolume();
    
    
	@Override
    public String show(){
		return String.format("%s, volume=%.02f",super.show(), getVolume());
    }
}