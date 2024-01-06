package Queue;
public class queueUsingArray {
	public static void main(String[] args) throws queueFullException, QueueEmptyException {
		//queueUsingClass c=new queueUsingClass();
		queuwUsingLinkedLIst<Integer> queue=new queuwUsingLinkedLIst<Integer>();
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int elem: arr) {
        	     queue.enQueue(elem);
        		//c.enqueue(elem);
        }
        while(!queue.isEmpty()) {
        	System.out.println(queue.deQueue());
        }
	}
}