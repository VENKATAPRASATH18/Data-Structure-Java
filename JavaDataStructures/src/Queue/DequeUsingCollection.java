package Queue;
import java.util.*;
public class DequeUsingCollection {
	public static void main(String[] args) {
		Deque<Integer> Dq = new ArrayDeque<>();
		Dq.add(10);
		Dq.addFirst(11);
		Dq.addLast(20);
		Dq.add(50);Dq.add(80);
		System.out.println(Dq);
		System.out.println(Dq.peek());
		System.out.println(Dq.peekFirst());
		System.out.println(Dq.peekLast());
		System.out.println(Dq.poll());
		System.out.println(Dq.pollFirst());
		System.out.println(Dq.pollLast());
		System.out.println(Dq.pop());
		System.out.println(Dq);
		
		
	}
}
