package priorityQueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
      private ArrayList<Element<T>> heap;
      public Priority_Queue(){
    	  heap=new ArrayList<>();
      }
      public void insert(T value,int priority) {
    	  Element<T> e=new Element<>(value,priority);
    	  heap.add(e);  //just added the element in the ArrayList
    	  int childIndex=heap.size()-1;  //because insertion will take place from rightest part of the array list 
    	  int parentIndex=(childIndex-1)/2;
    	  while(childIndex>0) {   //means we have not reached starting index of the array list
    		  if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
    			  Element<T> temp=heap.get(childIndex);
    			  heap.set(childIndex, heap.get(parentIndex));
    			  heap.set(parentIndex,temp);
    			  childIndex=parentIndex;
    			  parentIndex=(childIndex-1)/2;
    		  }
    		  else {
    			  return;
    		  }
    	  }
      }
      public T getMin() throws PriorityQueueException {
    	  if(isEmpty()) {
    		  throw new PriorityQueueException();
    	  }
    	  return heap.get(0).value;
      }
      public int size() {
    	  return heap.size();
      }
      public T removeMin() throws PriorityQueueException{
    	  if(isEmpty()) {
    		  throw new PriorityQueueException();
    	  }
    	  Element<T> removed=heap.get(0);
    	  T ans =removed.value;
    	  heap.set(0,heap.get(heap.size()-1));  //setting last element value in the first position of the arrayList
    	  heap.remove(heap.size()-1);    
    	  int parentIndex=0;
    	  int leftChildIndex=2*parentIndex+1;
    	  int rightChildIndex=2*parentIndex+2;
    	  while(rightChildIndex <heap.size()){
    		  int minIndex=parentIndex;
    		  if(heap.get(leftChildIndex).priority < heap.get(rightChildIndex).priority) {
    			  minIndex=leftChildIndex;
    		  }
    		  if(rightChildIndex<heap.size() && (heap.get(rightChildIndex).priority < heap.get(leftChildIndex).priority)) {
    			  minIndex=rightChildIndex;
    		  }
    		  if(minIndex==parentIndex) {
    			  break;
    		  }
    		  Element<T> temp=heap.get(minIndex);
    		  heap.set(minIndex, heap.get(parentIndex));
    		  heap.set(parentIndex, temp);
    		  parentIndex=minIndex;
    		  leftChildIndex=2*parentIndex+1;
        	  rightChildIndex=2*parentIndex+2;
    	  }
    	  return ans;
      }
      public boolean isEmpty() {
    	  if(size()==0) {
    		  return true;
    	  }
    	  return false;
      }
}
