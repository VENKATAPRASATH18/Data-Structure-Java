package LinkedList;
import java.util.LinkedList;
public class LinkedListUsingCollection {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1); l.add(5); l.add(10); l.add(25);  l.add(99); l.add(22);
		l.addFirst(0); 
		l.addLast(100);
		l.add(5, 50);
		System.out.println(l);
		System.out.println(l.getFirst());
		
		System.out.println(l.getLast());
		
		System.out.println(l.peek());
	
		System.out.println(l.peekFirst());
	
		System.out.println(l.peekLast());
		
		System.out.println(l.poll());
		System.out.println(l.pollFirst());
	
		System.out.println(l.pollLast());
		
		
		System.out.println(l.pop());
		
		System.out.println(l.remove());
		System.out.println(l.offer(20));
	
		System.out.println(l.offerFirst(23));
		
		System.out.println(l.offerLast(96));
		
		System.out.println(l);
	
		

	}

}
