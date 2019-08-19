import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(5);
		a1.add(3);
		a1.add(8);
		
		System.out.println(a1); //--> [5, 3, 8]
		
		a1.sort(null);
		
		System.out.println(a1); //--> [3, 5, 8]
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Bob");
		a2.add("Alice");
		a2.add("Aba");
		
		System.out.println(a2); //--> [Bob, Alice, Aba]
		
		a2.sort(null);
		
		System.out.println(a2); //--> [Aba, Alice, Bob]
	}

}
