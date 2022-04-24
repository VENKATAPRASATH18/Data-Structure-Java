package LinkedList;

public class LinkedListOperations{	
	Node head;
	
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}	
	}
	
	
	public void insertAtFirst(int data) {
		Node first = new Node(data);
		
		first.next=head;
		head=first;
	}
	
	public void insertAt(int index,int data) {
		Node node=new Node(data);
		
		if(index==0) {
			insertAtFirst(data);
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAtIndx(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node t=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			t=n.next;
			n.next=t.next;
			t=null;
		}
	}
	
	
	public void show() {
		Node nodeItr=head;
		if(head==null) {
			System.out.println("empty list");
		}
		while(nodeItr.next!=null) {
			System.out.print(nodeItr.data+"-->");
			nodeItr=nodeItr.next;
		}	
		System.out.print(nodeItr.data+"->>NULL\n");
		System.out.println();
		}
	
	
	public void getCount() {
		int count=0;
		Node curNod = head;
		while(curNod!=null) {
			count++;
			curNod=curNod.next;
		}
		System.out.println("count of nodes: "+count);
	}
	
	
	public void MidOfList() {
		// two pointer method slow shitfs/points by one node whereas fast shifted by 2 nodes
		    Node fast = head;
		    Node slow = head;
		    while(fast != null && fast.next != null){
		        slow = slow.next;
		        fast = fast.next.next;
		    }
		    System.out.println("Element in the midNode: "+slow.data);	
	}
	
	
	public void Reverse() {
		Node prev = null;
        Node current = head;
        Node nxt = null;
        while (current != null) {
        	nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        head = prev;//updating prev as head for the future itrating process.....
       
	}
	
	public void printReverse(Node headref)
    {
        if (headref == null)
        	return;
 
        // print list of head node
        printReverse(headref.next);
 
        // After everything else is printed
        System.out.print(headref.data+" ");
    }
	
public static void main(String[] args) {
		
		LinkedListOperations l = new LinkedListOperations();
		l.insert(18);
		l.insert(45);
		l.insert(12);
		l.insertAtFirst(25);
		
		l.insertAt(2, 55);
		l.insert(5);
		
		
		
		l.insert(65);
		l.insert(77);
		l.insertAt(3, 30);
		l.show();
		l.deleteAtIndx(3);
		l.insert(22);
		l.show();
		
		l.getCount(); // for counting number of nodes
		
		l.MidOfList(); // for finding the middest of the linkedlist
		
		l.Reverse(); // for reversing the linkedlist
		l.show();
		l.printReverse(l.head); //for printing the LL in reverse order but doesnt change the order of LL
		
		
	}
	
}
