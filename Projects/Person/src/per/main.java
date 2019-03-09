package per;
import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Person p1 = new Person("gogo", new Date(1942,4,17),null,null);
		Person p2 = new Person("gigi", new Date(1944,8,21),null,null);
		Person p3 = new Person("momo", new Date(1944,8,21),p1,p2);
		
		
		System.out.println(p1.print());
		System.out.println(p2.print());
		System.out.println(p3.print());


	}

}
