
public class DrawingBoard {
     private Shape[] shapes;
     private int counter=0;
     
     public DrawingBoard(int length) {
    	 shapes=new Shape[length];
     }
     
     
     public void showAll() {
    	
    	 for(int i=0; i<counter; i++) {
    		System.out.println(shapes[i].show());
		 }
     }
     
     public Shape getMax() {
    	 Shape max=shapes[0];
 
    	 for(int i=1; i<counter; i++) {
			 if(max.compare(shapes[i])==-1)
					max=shapes[i];
		 }
    	 
    	 return max;
     }
     
     
     public Shape3D getMax3DV1() {
    	 Shape3D max=null;
    	 
    	 for(int i=0; i<counter; i++) {
			 if(shapes[i] instanceof Shape3D) {
				if(max==null ||
					max.getVolume()<((Shape3D)shapes[i]).getVolume()){
					max=(Shape3D)shapes[i];
				}
			 }	
		 }
    	 
    	 return max; 
     }
     
     
     public Shape3D getMax3DV2() {
    	return getMax3DV1();
     }
     
     
     public Class[] getTypes() {
    	 Class[] classArray=new Class[counter];
    	 
    	 for(int i=0; i<counter; i++) {
    		 classArray[i]=shapes[i].getClass();
		 } 
    	 
    	 return classArray;
     }
     
     
     public void add(Shape ...s) {
    	   	
    	 while(counter+s.length > shapes.length) {
    		 Shape[] temp=shapes;
    		 shapes=new Shape[(int) (shapes.length*1.5)];
    		 for(int i=0; i<counter; i++) {
    			 shapes[i]=temp[i];
    		 }
    	 }
    	 
    	 
    	 for(int i=0; i<s.length; i++) {
			 shapes[counter++]=s[i];
		 }
     }
}
