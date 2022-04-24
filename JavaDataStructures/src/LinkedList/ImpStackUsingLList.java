package LinkedList;

class Stack {
	 

    private class Node {
 
        int data; 
        Node next; 
    }
   
    Node top= null;;
  int size=0;
   
 
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();
 
        
        if (temp == null) {
           System.out.println("\nHeap Overflow");
       }
        else{
        	  temp.data = x;
              temp.next = top;
              top = temp;
              size++;
        	}
      
    }
 
    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
 
   
    public void pop() 
    {
        // check for stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");
        }
 
        // update the top pointer to point to the next node
        else {
        top = top.next;
        size--;}
    }
 
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");

        }
        else {
            Node temp = top;
            while (temp != null) {          
                System.out.printf("%d->", temp.data);
                temp = temp.next;
            }
            System.out.print("NULL\n");
        }
    }
}
// main class
public class ImpStackUsingLList {
    public static void main(String[] args)
    {
      
        Stack obj = new Stack();  
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);    
        obj.display();
        System.out.println("size is is "+ obj.size);   
        System.out.println("Top element is "+ obj.peek());       
        obj.pop();
        obj.pop();
        obj.display();
        System.out.println("size is is "+ obj.size);
        System.out.println("top element is "+ obj.peek());
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println("size is is "+ obj.size);
    }
}
