import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> cart=new ArrayList<String>();
		
		System.out.println(cart.size());  //--> 0
		
		cart.add("Milk");
		cart.add("Bread");
		
		System.out.println(cart.size());  //--> 2
		
		System.out.println(cart.get(0));  //--> Milk
		
		cart.add("Coffee");
		
		for(int i=0; 
				i< cart.size();
				System.out.print(cart.get(i++) + " "));
		
		System.out.println();
		
		for(String s:cart) {
			System.out.print(s+ " ");
		}
		
		ArrayList<String> junk=new ArrayList<String>();
		junk.add("Milka");
		junk.add("Kinder");
		
		cart.addAll(junk);
		
		cart.remove(0); 
		cart.remove("Bread");
	

	}

}
