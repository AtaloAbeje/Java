
public class Program {

	public static void main(String[] args) {
		Pizza p1=new Pizza("olives");
		System.out.println("pizza number: " 
							+ Pizza.getCounter()
							+" has topping: "
							+ p1.getTopping());

		Pizza p2=new Pizza("corn");
		System.out.println("pizza number: " 
							+ Pizza.getCounter()
							+" has topping: "
							+ p2.getTopping());
	}

}
