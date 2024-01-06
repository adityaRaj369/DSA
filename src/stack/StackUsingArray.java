package stack;

public class StackUsingArray {
	    private int data[];
	    private int topIndex;  //Index of the top most element of the stack

	    public StackUsingArray(int size){
	        data= new int[size];
	        topIndex=-1;
	    }
	    public StackUsingArray(){
	        data= new int[3];
	        topIndex=-1;
	    }
	    //O(1)
	    public int size(){
	        return topIndex+1;
	    }
	    //O(1)
	    public boolean isEmpty(){
	          //if(topIndex==-1) return true;
	          //else return false;
	          return topIndex == -1;  //it will check if the stack topIndex is -1 1 then it will return true else return false
	    }
	    //O(1);
	    public void push(int elem){
	          //If stack is full
	          if(topIndex==data.length-1){
                 doubleCapacity();
	          }
	          topIndex++;
	          data[topIndex]= elem;
	    }
	    private void doubleCapacity() {
	    	//System.out.println("Double Capacity");
			int temp[]=data;
			data=new int[2*temp.length];
			for(int i=0;i<temp.length;i++){
				data[i]=temp[i];
			}
		}
		//O(1)
	    public int top() throws StackEmptyException, StackFullException{
	      if(topIndex==-1){
	        //Throw stack empty exception
	        throw new StackFullException();
	      }
	        return data[topIndex];
	    }
	    //O(1)
	    public int pop() throws StackEmptyException{
	        if(topIndex==-1){
	            throw new StackEmptyException();
	        }
	        int temp = data[topIndex];
	        topIndex--;
	        return temp;
	    }
}