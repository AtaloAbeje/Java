// DRY 	= do not repeat yourself
public class Program {

	public static boolean compareObjects(int n1, int n2) {
		return(n1==n2);
	}
	
	
	public static boolean compareObjects(double n1, double n2) {
		return(n1==n2);
	}
	
	
	public static boolean compareObjects(char n1, char n2) {
		return(n1==n2);
	}
	
	public static void main(String[] args) {		
		System.out.println(compareObjects(2,2));
		System.out.println(compareObjects(2.2,2.2));
		System.out.println(compareObjects('a','a'));
		
	
	}

}
