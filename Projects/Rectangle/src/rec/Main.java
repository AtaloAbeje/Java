package rec;
import java.util.Scanner;

public class Main  // Q 3/2 
{

	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		int n = 0;
		
		System.out.println("Enter iength: ");
		int ien = in.nextInt();
		rec.setIength(ien);
		
		System.out.println("Enter width: ");
		int width = in.nextInt();
		rec.setWidth(width);
		
		System.out.println("Circuit: "+rec.get_circuit());
		System.out.println("Area: "+rec.get_area());
		
		while(n < 1)
		{
			System.out.println("Enter One char:");
			String cs = in.nextLine();
			if(cs.equals(1)) {
				System.out.print(rec.print(cs));
				n++; break;
			}
			else {
				System.out.println("Enter One char!");
			}
		}
	}
}
