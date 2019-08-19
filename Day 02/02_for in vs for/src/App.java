
public class App {

	public static void main(String[] args) {
		
		//---------------------------array-------------------------
		int[] arr1=new int[2];
		arr1[0]=4;
		arr1[1]=7;
		
		for(int element:arr1) {
			element=5;
			System.out.print(element+" ");
		}  //--> 5 5 
		
		
		System.out.println();
		
		for(int element:arr1) {
			System.out.print(element+" ");
		} //--> 4 7 
		
		
		System.out.println();
		
		for(int i=0; i< arr1.length;i++) {
			arr1[i]=5;
			System.out.print(arr1[i]+" ");
		}  //--> 5 5 
		
		
		System.out.println();
		
		for(int i=0; i< arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}  //--> 5 5 
		

		System.out.println();
		
		//---------------------------matrix-------------------------
		
		int[][] mat1=new int[][] {{2,2},{2,2}};
		
		for(int[] element:mat1) {
			element[0]=3;
			element[1]=3;
		} 
		
		for(int[] arr:mat1) {
			for(int element:arr) {
				System.out.print(element+ " ");
			}
		}  //--> 3 3 3 3 
		
	}

}
