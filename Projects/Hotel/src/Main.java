import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Hotel[] HotelArr = new Hotel[3];
		
		HotelArr[0] = new Hotel("lala", "boo", 300, 20);
		HotelArr[1] = new Hotel("looo", "tel aviv", 200, 10);
		HotelArr[2] = new Hotel("looo", "jufa", 100, 0);
		
		System.out.println("Enter City Name:");
		String s = in.nextLine();
		
		for(int i = 0; i < HotelArr.length; i++)
		{
			if(HotelArr[i].City.equals(s))
				HotelArr[i].Print();
		}
	}
}
