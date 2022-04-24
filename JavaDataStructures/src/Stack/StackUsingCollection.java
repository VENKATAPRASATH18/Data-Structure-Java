package Stack;
import java.util.Stack;

public class StackUsingCollection {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(55);
		s.push(85);
		s.push(50);
		s.push(12);
		s.push(100);
		s.push(16);
		s.add(5);
		
		
		System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s.empty());
	System.out.println(s.capacity());
	System.out.println(s.pop());
	

	}

}
