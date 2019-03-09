package Cook;
import javax.swing.JOptionPane;
public class MainCookie {
	
	public static void main(String[] args) 
	{
		int n = 0;
		Cookie cook1 = new Cookie();
		Cookie cook2 = new Cookie();
		Cookie cook3 = new Cookie();
		
		while(n < 1)
		{
			String input_gluten = JOptionPane.showInputDialog("do you want gluten? enter y/n:");
			if(input_gluten.equals("y"))
			{
				cook1.setGluten(true);
				n++;
			}
			else if(input_gluten.equals("n"))
			{
				cook1.setGluten(false);
				n++;
			}
			else if(!input_gluten.equals("n") && !input_gluten.equals("y"))
				System.out.println("Enter your choice!");
			
			n--;
			String eggs = JOptionPane.showInputDialog("do you want gluten? enter y/n:");
			

			
		}

	}

}
