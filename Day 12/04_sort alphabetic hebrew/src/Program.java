import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("יד");
		list.add("טו");
		list.add("טז");
		list.add("יז");
		list.add("יא");
		list.add("יב");
		list.add("יג");
		//--> [יד, טו, טז, יז, יא, יב, יג]
		System.out.println(list);
	
		list.sort(null);
			
		//--> [טו, טז, יא, יב, יג, יד, יז]
		System.out.println(list);

		
		/*Your task
		 * (Create new class that implements Comparator<String>)
		 * */
		//--> [ יא, יב, יג, יד, טו, טז,יז]
		System.out.println(list);
	}

}
