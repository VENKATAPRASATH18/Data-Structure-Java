package DELinkedList;

public class DELmain {
	Node head;
	
	public void insert(int new_data)
	    {
	        Node new_node = new Node(new_data);
	 
	        Node curr = head; 
	 
	        /* If the Linked List is empty, then make the new node as head */
	        if (head == null) {
	            new_node.prev = null;
	            head = new_node;
	        }
	 
	        else {
	        while (curr.next != null)
	        	curr = curr.next;
	        
	        curr.next = new_node;
	        new_node.prev = curr;}
	    }
	 
	public void InsertAtBegin(int new_data)
	{
	    
	    Node new_Node = new Node(new_data);
	 
	    /* 3. Make next of new node as head and previous as NULL */
	    new_Node.next = head;
	    new_Node.prev = null;
	 
	   
	    if (head != null)
	        head.prev = new_Node;
	 
	    
	    head = new_Node;
	}
/*
	public void InsertAfter(Node prev_Node, int new_data)
    {
 
        /*1. check if the given prev_node is NULL */
      //  if (prev_Node == null) {
      //      System.out.println("The given previous node cannot be NULL ");
    //        return;
     //   }
 
        /* 2. allocate node
        * 3. put in the data */
    //    Node new_node = new Node(new_data);
 
        /* 4. Make next of new node as next of prev_node */
   //     new_node.next = prev_Node.next;
 
        /* 5. Make the next of prev_node as new_node */
    //    prev_Node.next = new_node;
 
        /* 6. Make prev_node as previous of new_node */
   //     new_node.prev = prev_Node;
 
        /* 7. Change previous of new_node's next node */
  //      if (new_node.next != null)
   //         new_node.next.prev = new_node;
  //  } 
	public void insertAt(int index,int d) {
		Node new_node=new Node(d);
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		new_node.prev=temp.prev;
		new_node.
	}

	
	 public Node deleteNode(Node delref)
	    {
	        
	        if (head == null || delref == null)
	            return null;//empty
	 
	        // If node to be deleted is head node
	        if (head == delref)
	            head = delref.next;
	 
	        // Change next only if node to be
	        // deleted is NOT the last node
	        if (delref.next != null)
	        	delref.next.prev = delref.prev;
	 
	        // Change prev only if node to be
	        // deleted is NOT the first node
	        if (delref.prev != null)
	        	delref.prev.next = delref.next;
	 
	        delref = null;
	 
	        return head;
	    }
	 
	  
	    public void deleteNodeAtGivenIndex(int n)
	    {
	        /* if list in NULL or
	          invalid position is given */
	        if (head == null || n < 0)
	        	System.out.println("invalid indx");
	 
	        Node current = head;
	        int i;
	 
	        /*traverse up to the node at position 'n' from the beginning */
	        for (i = 0; current != null && i < n; i++)
	        {
	            current = current.next;
	        }
	         
	       
	 
	        // delete the node pointed to by 'current'
	        deleteNode(current);
	    }
	public void printlist()
    {
        Node last = null;
        Node temp = head;
        System.out.println("Traversal in forward Direction");
        while (temp != null) {
            System.out.print(temp.data + " ");
            last = temp;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
