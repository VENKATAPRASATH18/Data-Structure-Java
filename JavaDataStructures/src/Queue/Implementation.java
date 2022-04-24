package Queue;

//LinearQueue 
	class Queue
	{
	    private int[] arr;      // array to store queue elements
	    private int front;      // front points to the front element in the queue
	    private int rear;       // rear points to the last element in the queue
	    private int capacity;   // maximum capacity of the queue
	    private int count;      // current size of the queue
	 
	    // Constructor to initialize a queue
	    Queue(int size)
	    {
	        arr = new int[size];
	        capacity = size;
	        front = 0;
	        rear = -1;
	        count = 0;
	    }
	 
	    // Utility function to dequeue the front element
	    public void dequeue()
	    {
	        // check for queue underflow
	        if (isEmpty())
	        {
	            System.out.println("Underflow\nProgram Terminated");
	            System.exit(1);
	        }
	 
	        System.out.println("Removing " + arr[front]);
	 
	        front = (front + 1);
	        count--;
	    }
	 
	    public void enqueue(int item)
	    {
	        if (isFull())
	        {
	            System.out.println("Overflow\nProgram Terminated");
	            System.exit(1);
	        }
	 
	        System.out.println("Inserting " + item);
	 
	        rear = (rear + 1);
	        arr[rear] = item;
	        count++;
	    }
	 
	    public int peek()
	    {
	        if (isEmpty())
	        {
	            System.out.println("Underflow\nProgram Terminated");
	            System.exit(1);
	        }
	        return arr[front];
	    }

	    public int size() {
	        return count;
	    }

	    public Boolean isEmpty() {
	        return (count == 0);
	    }

	    public Boolean isFull() {
	        return (count == capacity);
	    }
	}
	 
	public class Implementation {
	
	    public static void main (String[] args)
	    {
	        // create a queue of capacity 5
	        Queue q = new Queue(5);
	 
	        q.enqueue(1);
	        q.enqueue(2);
	        q.enqueue(3);
	        q.enqueue(5);
	 
	        System.out.println("The front element is " + q.peek());
	        q.dequeue();
	        System.out.println("The front element is " + q.peek());
	 
	        System.out.println("The queue size is " + q.size());
	 
	        q.dequeue();
	        q.dequeue();
	 
	        if (q.isEmpty()) {
	            System.out.println("The queue is empty");
	        }
	        else {
	            System.out.println("The queue is not empty");
	        }
	    }
	}
	


