package LinkedList;

public class CircularUsingSLL {
	Node head=null; 
	public void displayList()
	{
	    Node start = head;
	    Node Currnode=head;
	 
	    while (Currnode.next != start)
	    {
	        System.out.print(" "+ Currnode.data);
	        Currnode = Currnode.next;
	    }
	     
	    // Display the last node of 
	    // circular linked list.
	    System.out.print(" " + Currnode.data);
	}
}
