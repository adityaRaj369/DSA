package Tree;
import Queue.QueueEmptyException;
import linkedList.Node;

public class QueueUsingLL<T> {
	 private Node<T> front;
	 private Node<T> rear;
	   int size;
	   public boolean isEmpty() {
		   return size==0;
	   }
	   public void enQueue(T elem) {
		   Node<T> newNode=new Node<T>(elem);
		   if(front==null) {
			   front=newNode;
			   rear=newNode;
		   }
		   else {
			   rear.next=newNode;
			   rear=newNode;
			   size++;
		   }
	   }
	   public T front() throws QueueEmptyException  {
		   if(front==null) {
			   throw new QueueEmptyException();
		   }
		   else {
			   return front.data;
		   }
	   }
	   public T deQueue() throws QueueEmptyException {
		   if(front==null) {
			   throw new QueueEmptyException();
		   }
		   T temp=front.data;
		   front=front.next;
		   size--;
		   if(front==null){
			   rear=null;
		   }
		   
		   return temp;
	   }
	}