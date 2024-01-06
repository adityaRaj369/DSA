package recursion2;

public class binarysearch {
    public static int binarySearch(int[]a,int si,int ei,int x) {
    	if(si>ei) {
    		return -1;
    	}
    	int midindex=(si+ei)/2;
    	if(a[midindex]==x) {
    		return midindex;
    	}
    	else if(a[midindex]<x) {
    		return binarySearch(a,midindex+1,ei,x);
    	}else {
    		return binarySearch(a,si,midindex-1,x);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.print( binarySearch(arr,0,8,8));
	}
}