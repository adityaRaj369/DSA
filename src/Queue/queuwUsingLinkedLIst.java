package Queue;

import linkedList.Node;

public class queuwUsingLinkedLIst <T> {
   private Node<T> front;
   private Node<T> rear;
   int size;
   
   public queuwUsingLinkedLIst() {
	   front =null;
	   rear=null;   //if we didnt write all three the it will be ok because it is previously present in default constructer
	   size=0;
   }
   
   public int size() {
	   return size;
   }
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
	   if(front==null) {
		   rear=null;
	   }
	   size--;
	   return temp;
   }
}
