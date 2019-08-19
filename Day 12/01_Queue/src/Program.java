import java.util.*;

public class Program {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();  //FIFO
		
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		System.out.println(queue.peek());  //--> a
		
		Stack<String> stack=new Stack<String>();  //LIFO
		
		stack.add("a");
		stack.add("b");
		stack.add("c");	
		
		System.out.println(stack.peek());  //--> c
		
		

	}

}
