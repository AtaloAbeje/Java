
public class Program {

	public static void main(String[] args) {
		IMove m1=new Person("Bob");
		m1.moveRight();
		m1.moveLeft();
		
		IMove m2=new Car("Red");
		m2.moveRight();
		m2.moveLeft();

	}

}
