public class Program {

	public static <T extends Food & Drinkable<T>> void printType(T obj) {
		System.out.println(obj.isReady());
	}
	
	public static void main(String[] args) {
		printType(new FruitShake());
		printType(new VegShake());
	}
}
