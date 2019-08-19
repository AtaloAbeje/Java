
public class App {

	public static void main(String[] args) {
		int[] arr1=new int[2];
		arr1[0]=4;
		arr1[1]=7;
		
		int[] arr2=new int[]{4,7};
		
		
		int[][] mat1=new int[2][2];
		mat1[0][0]=3;
		mat1[0][1]=4;
		mat1[1][0]=5;
		mat1[1][1]=6;
		
		
		int[][] mat2=new int[][] {{3,4},{5,6}};
		
		
		// row 0 : children of Alice ( Tim , Joe , Vitaly)
		// row 1 : children of Bob ( Tom , Clark)
		String[][] mat3= new String[2][];
		mat3[0]=new String[3];
		mat3[0][0]="Tim";
		mat3[0][1]="Joe";
		mat3[0][2]="Vitaly";
		mat3[1]=new String[2];
		mat3[1][0]="Tom";
		mat3[1][1]="Clark";
		
		String[][] mat4= new String[][] {
			{"Tim","Joe", "Vitaly"},
			{"Tom","Clark"}};
			
		for(int row=0; row<mat4.length; row++) {
			for(int col=0; col<mat4[row].length; col++) {
				System.out.print(mat4[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for(String[] arr:mat4) {
			for(String element:arr) {
				System.out.print(element+ " ");
			}
			System.out.println();
		}
		
	}

}
