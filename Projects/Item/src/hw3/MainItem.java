package hw3;

import java.util.Scanner;

public class MainItem
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Item[] MyItem = new Item[1];
		
		for(int i=0; i<MyItem.length; i++)
		{
			System.out.println("Enter Catalog Number:");
			long l = in.nextLong();
			
			System.out.println("Enter Item Name:");
			String n = in.nextLine();
			
			System.out.println("Enter Price for item:");
			float p = in.nextFloat();
			
			MyItem[i] = new Item(l, n, p);
			l = in.nextLong();
		}
		NewItem[] MyNewItem = new NewItem[1];
		
		MyNewItem[0].Cost(20);
	}
}
