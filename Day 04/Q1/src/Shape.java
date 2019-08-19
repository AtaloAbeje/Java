abstract class Shape {
    private int x;
    private int y;
    
    public Shape(int x, int y) {
    	setX(x);
    	setY(y);
    }
    
    
    public int compare(Shape s) {
    	if(getArea() > s.getArea())
    		return 1;
    	
    	if(getArea() < s.getArea())
    		return -1;
    	
    	return 0;
    }
    
    abstract public double getArea();
    
    @Override
    public boolean equals(Object o) {
    	return getClass().getName().equals(o.getClass().getName()) 
				&& getX() == ((Shape)o).getX()
				&& getY() == ((Shape)o).getY();
    }
    
    public String show(){
    	 Class c;
		 for(c=getClass(); 
				 !c.getName().equals("Shape2D") && !c.getName().equals("Shape3D");
				 c=c.getSuperclass());
    	return String.format("%s:%s:x=%d, y=%d, area=%.02f",
    			c.getName(),getClass().getName(),getX(),getY(),getArea());
    }
    
    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}