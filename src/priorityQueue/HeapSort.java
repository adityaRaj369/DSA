package priorityQueue;

public class HeapSort {
      
	public static void heapSort(int arr[]) {
		//first we build the heap
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			downHeapify(arr,i,n);
		}
		//after building the heap now we move the elements from starting one by one and move them to last position
	    for(int i=n-1;i>=0;i--) {
	    	int temp=arr[i];
	    	arr[i]=arr[0];
	    	arr[0]=temp;
	    	downHeapify(arr,0,i);
	    }
	}
	
	public static void downHeapify(int []arr,int i,int n) {  // i=startPosition 
		int parentIndex=i;
		int leftChildIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		while(leftChildIndex<n) {
			int minIndex=parentIndex;
			if(arr[minIndex]>arr[leftChildIndex]) {
				minIndex=leftChildIndex;
			}
			if(rightChildIndex<n && arr[minIndex]>arr[rightChildIndex]) {
				minIndex=rightChildIndex;
			}
			if(minIndex==parentIndex) {
				break;
			}
			int temp=arr[parentIndex];
			arr[parentIndex]=arr[minIndex];
			arr[minIndex]=temp;
			parentIndex=minIndex;
			leftChildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
		}
	}
	
	public static void main(String []args) {
		int [] arr= {4,7,3,2,8,9,6,1};
		heapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
