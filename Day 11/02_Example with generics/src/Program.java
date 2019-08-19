
public class Program{

	public static <T> boolean compareObjects(T n1, T n2) {
		return n1==n2;
	}

	public static void main(String[] args) {		
		System.out.println(compareObjects("a","s"));
		System.out.println(compareObjects('a','a'));
	}

}
