package Queue;

public class queueUsingClass {
    private int data[];
    private int front;
    private int rear;
    private int size;
    
    
    public queueUsingClass() {
    	data =new int[5];
    	front=-1;
    	rear=-1;
    }
    public queueUsingClass(int capacity) {
    	data =new int[capacity];
    	front=-1;
    	rear=-1;
    }
    public int size() {
    	return size;
    }
    public void enqueue(int elem) throws queueFullException{
    	if(size==data.length) {
    		//throw new queueFullException();
    		doubliCapacity();
    	}
    	if(size==0) {          
    		front=0;
    	}
    	rear++;
    	if(rear==data.length) {
    		rear=0;
    	}
    	//or we can simply write the following code to avoid the above code
    	// rear=(rear+1)%data.length;   //it auto sets the rear to zero when it becomes equal to the data.length
    	data[rear]=elem;
    	size++;
    }
    public int dequeue() throws QueueEmptyException {
    	if(size==0) {
    		throw new QueueEmptyException();
    	}
    	int temp=data[front];
    	front++;
    	if(front==data.length){
    		front=0;
    	}
    	// or similarly we can write front=(front +1)%data.length;
    	size--;
    	if(size==0){
    		front=-1;
    		rear=-1;
    	}
    	return temp;
    }
    private void doubliCapacity() {
		int temp[]=data;    //we are storing all the elements of the array of the data
	    data=new int[2*temp.length];
	    int index=0;
	    for(int i=front;i<temp.length;i++) {
	    	data[index++]=temp[i];
	    }
	    for(int i=0;i<front-1;i++) {
	    	data[index++]=temp[i];
	    }
	    front=0;
	    rear=temp.length-1;
	    
    }
	public int front() throws QueueEmptyException {
        if(size==0) {
        	throw new QueueEmptyException();
        }
    	return data[front];
    }
    public boolean isEmpty() {
    	return size==0;
    }
}
