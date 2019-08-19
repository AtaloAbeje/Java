
public class Program {

	public static void main(String[] args) {
		Pair<Integer> p1=new Pair<Integer>(1,2);
		System.out.println(p1.getFirst() + " "+p1.getSecond());

		
		Pair<String> p2=new Pair<String>("Bob","Alice");
		System.out.println(p2.getFirst() + " "+p2.getSecond());

	}

}
