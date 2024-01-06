package recursion;

public class ifArrayIsSorted {
    public static boolean isSorted(int ar[]) {
    	if(ar.length==1) {
    		return true;
    	}
    	if(ar[0]>ar[1]) {
    		return false;
    	}
    	//if arr[0]<arr[1] then array is sorted and then we copy all elements from arr[1] and paste it in new array
    	int smallArray[]=new int[ar.length-1];
    	for(int i=1;i<ar.length;i++) {
    		smallArray[i-1]=ar[i];
    	}
    	boolean isSmallArraySorted=isSorted(smallArray);
    	return isSmallArraySorted;
    }
    public static boolean isSortedBetter(int a[],int si) {  // si=start index
    	if(si==a.length-1) {
    		return true;
    	}
    	if(a[si]>a[si+1]) {
    		return false;
    	}
    	boolean istrueOrNot=isSortedBetter(a,si+1);
    	return istrueOrNot;
    	
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
	    boolean r=isSorted(arr);
	    boolean r1=isSortedBetter(arr,0);
		System.out.println(r);
		System.out.println(r1);
	}

}
