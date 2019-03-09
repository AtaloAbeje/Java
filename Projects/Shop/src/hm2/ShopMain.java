package hm2;
import java.util.Scanner;

public class ShopMain 
{

	public static void cheapest(Shop ShopArr[], int Bnana, int Apple, int Orange)
	{

		int index = 0; 
		Double sum, min = (ShopArr[0].Banana+ShopArr[0].Apple+ShopArr[0].Orange);
		
		for(int i=1; i<ShopArr.length; i++)		
		{
			sum=ShopArr[i].Banana+ShopArr[i].Apple+ShopArr[i].Orange;
			if(min > sum)
			{
				sum=min;
				index=i;
			}	
		}
		ShopArr[index].Print();			
	}
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		String s;
		Double b, a, o;
		Shop[] ShopArr = new Shop[2];
		
		for (int i = 0; i < ShopArr.length; i++) 
		{
			System.out.println("Enter shop name: "+i);
			s = in.nextLine();
			
			System.out.println("Enter Price KG Banana:"+i);
			b = in.nextDouble();
			
			System.out.println("Enter Price KG Apple:"+i);
			a = in.nextDouble();
			
			System.out.println("Enter Price KG Orange:"+i);
			o = in.nextDouble();

			ShopArr[i] = new Shop(s, b, a, o);
			s = in.nextLine();
		}
		cheapest(ShopArr, 1, 2, 3);
		
		in.close();
	}

}
