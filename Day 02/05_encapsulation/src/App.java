
public class App {
	public static void main(String[] args) {
		Person p1=new Person();
		
		
		System.out.println(p1.getAge());  //--> 0
		p1.setAge(40);
		System.out.println(p1.getAge());  //--> 40
		p1.setAge(140);
		System.out.println(p1.getAge());  //--> 40
	}
}
