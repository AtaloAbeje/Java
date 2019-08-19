public class Program {
	public static void main(String[] args) {
		
		
		DrawingBoard board=new DrawingBoard(5);
		
		board.add(
				new Rectangle(2,6), 
				new Ellipse(7,4),
				new Cube(4), 
				new Sphere(4),
				new Circle(5),
				new Triangle90dg(3,9),
				new Square(5)
				);
		
		System.out.println("------showAll-----");
		board.showAll();
		
		
		Shape max=board.getMax();
		System.out.println("------getMax-----");
		System.out.println(max.show());
		
		Shape3D max3D1=board.getMax3DV1();
		System.out.println("------getMax3DV1-----");
		System.out.println(max3D1.show());
		
		Shape3D max3D2=board.getMax3DV2();
		System.out.println("------getMax3DV2-----");
		System.out.println(max3D2.show());
		
		
		Circle c1=new Circle(5);
		Circle c2=new Circle(8);
		Circle c3=new Circle(5);
		System.out.println("------Check equals-----");
		System.out.println("c1 equals c2: "+ c1.equals(c2));
		System.out.println("c1 equals c3: "+ c1.equals(c3));
		
		
		System.out.println("------Types of shapes in board-----");

	    for(Class c:board.getTypes()) {
	    	System.out.print(c.getName()+" ");
	    }
	
	}
}
