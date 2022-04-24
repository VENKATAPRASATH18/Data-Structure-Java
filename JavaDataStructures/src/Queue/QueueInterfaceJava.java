package Queue;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
public class QueueInterfaceJava {

	public static void main(String[] args) {
		Queue<Integer> q=  new ArrayDeque<>();//linear
		q.add(10); q.add(20); q.add(30); q.add(40);
		System.out.println( q.peek());
		System.out.println( q.poll());
		System.out.println( q.remove());
		System.out.println( q);
		
		
		

	}

}
