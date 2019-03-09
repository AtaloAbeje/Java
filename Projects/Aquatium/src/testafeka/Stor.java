package testafeka;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Stor 
{
	Scanner in = new Scanner(System.in);
	private static FileWriter fw;
	private static PrintWriter pw;

	private ArrayList<Aquatium> arr; 
	
	public Stor() 
	{
		arr = new ArrayList<Aquatium>();
		try {
			
			fw = new FileWriter("out.tex");
			pw = new PrintWriter(fw);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public int menu()
	{
		System.out.println("MENU\nPick you choice:\n [1] – fresh water\n[2] – salt water\n[3] – exit");
		return in.nextInt();	
	}
	
	public void addAquarium(Aquatium a) {
		arr.add(a);
	}
	
	public void deleteAquarium(String name) {
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).equals(name)) {
				arr.remove(i);
				i--;
			}
		}
	}
	
	public void sorted () {
		int n = arr.size();
		Aquatium tmp;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j < (n-1); j++) {
				if(arr.get(j-1).getSize() < arr.get(j).getSize()) {
					tmp = arr.get(j-1);
					arr.set((j-1), arr.get(j));
					arr.set(j, tmp);					
				}
			}
		}
	}
	public void printBestAquarium(int rate) {
		
		for(Aquatium a: arr) {
			if (a instanceof SaltAquarium && a.isLonger(rate)) {
				pw.write(a.toString());
			}
			else
				System.out.println("the rate is bigger");
		}
	}
	public int howmuchrate() 
	{
		int cnt = 0;
		
		for(Aquatium a: arr) {
			if (a instanceof SaltAquarium) {
				SaltAquarium s = (SaltAquarium) a;
				if(s.getSaltRating() == 'b' || s.getSaltRating() == 'c') {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
}
