
public class Program {

	public static void main(String[] args) {
		Pair<Integer,Character> p1=new Pair<Integer,Character>(1,'a');
		System.out.println(p1.getFirst() + " "+p1.getSecond());


		
		Pair<String,String> p2=new Pair<String,String>("Bob","Alice");
		System.out.println(p2.getFirst() + " "+p2.getSecond());

	}

}
