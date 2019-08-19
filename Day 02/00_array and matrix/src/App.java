
public class App {
	
	public static void changeVal(int p) {
		System.out.println("first step in func changeVal " + p);  //--> first step in func changeVal 3
		p=9;
		System.out.println("second step in func changeVal " + p);  //--> second step in func changeVal 9
	}

	
	public static void changeRef(int[] p) {
		System.out.println("first step in func changeVal " + p[0] + p);
		p[0]=9;
		System.out.println("second step in func changeVal " + p[0] + p);
	}

	public static void main(String[] args) {
		
		// Val type: int char boolean double
		int num1=3;
		int num2=num1;
		int num3=3;
		
		System.out.println(num1+ " " + num2 + " " + num3); //--> 3 3 3 
		
		System.out.println(num1==num2);  //--> true
		System.out.println(num1==num3);  //--> true
		
		num2=8;
		System.out.println(num1+ " " + num2 + " " + num3); //--> 3 8 3 
		
		
		System.out.println("before func changeVal " + num1); //--> before func changeVal 3
		changeVal(num1);
		System.out.println("after func changeVal " + num1);  //--> after func changeVal 3
		
		
		// Ref type: String Object Array
		int[] arr1=new int[] {1,1,1};
		int[] arr2=arr1;
		int[] arr3=new int[] {1,1,1};
		
		
		
		System.out.println(arr1+ " " + arr2 + " " + arr3); //--> [I@77556fd [I@77556fd [I@368239c8
		System.out.println(arr1[1]+ " " + arr2[1] + " " + arr3[1]); //--> 1 1 1
		
		System.out.println(arr1==arr2);  //--> true
		System.out.println(arr1==arr3);  //--> false
		
		arr2[1]=8;
		System.out.println(arr1+ " " + arr2 + " " + arr3); //--> [I@77556fd [I@77556fd [I@368239c8
		System.out.println(arr1[1]+ " " + arr2[1] + " " + arr3[1]); //--> 8 8 1
		
		
		System.out.println("before func changeRef " + arr1[0] + arr1);
		changeRef(arr1);
		System.out.println("after func changeRef " + arr1[0] + arr1);
	}

}
