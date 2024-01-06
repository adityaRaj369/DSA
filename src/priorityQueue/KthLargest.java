package priorityQueue;
import java.util.PriorityQueue;
public class KthLargest {
  
	public static void printKLargest(int[] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {  //now we will compare the top element of the priority queue with the first element of arr
			if(pq.peek()<arr[i]) {
				pq.poll();  //now we deleted the element
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	public static void main(String [] args) {
		int [] arr= {4,1,6,3,7,2,9,8};
		int k=3;
		printKLargest(arr,k);
	}
	
}
