package stackUsingLinkedList;
  import linkedList.Node;
import stack.StackEmptyException;
public class StackUsingLL<T> {
     private Node<T>head;
     private int size;
     
     public int size() {
    	 return size;
     }
     public StackUsingLL() {
    	 head=null;
    	 size=0;             //if we didn't wrote it it would be same we write or not write it because its default constructer
     }
     public boolean isEmpty(){
    	 return size==0;
     }
     public void push(T elem) {
    	 Node<T> newNode=new Node<T>(elem);
    	 newNode.next=head;
    	 head=newNode;
    	 size++;
     }
     public T top() throws StackEmptyException{
    	 if(head==null) throw new  StackEmptyException();
    	 return head.data;
     }
     public T pop() throws StackEmptyException {
    	 if (head==null) throw new StackEmptyException();
    	 T temp=head.data;
    	 head=head.next;
    	 size--;
    	 return temp;       //we are returning the data that we have deleted
     }

public static void main(String[] args) {
    StackUsingLL<Integer> stack = new StackUsingLL<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    try {
        System.out.println("Top element: " + stack.top());
    } catch (StackEmptyException e) {
        System.out.println("Stack is empty.");
    }
    try {
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
    } catch (StackEmptyException e) {
        System.out.println("Stack is empty.");
    }

    if (stack.isEmpty()) {
        System.out.println("Stack is empty.");
    } else {
        System.out.println("Stack is not empty.");
    }

    System.out.println("Stack size: " + stack.size());
}
}