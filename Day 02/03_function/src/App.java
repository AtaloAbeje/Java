
public class App {

	
	/*
	 hello world
	 
	 pascal : HelloWorld
	 camel :  helloWorld
	 */
	
	
	//------------function overloading---------------
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	public static int sum(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public static int mul(int ...n) {
		int res=1;
		
		for(int element:n) {
			res*=element;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,3));
		
		
		System.out.println(mul());
		System.out.println(mul(2));
		System.out.println(mul(2,3));
			
	}

}
