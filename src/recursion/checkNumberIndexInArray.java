package recursion;

public class checkNumberIndexInArray {
    public static int index(int arr[],int x,int si) {
    	if(si==arr.length) {
    		return -1;
    	}
    	if(arr[si]==x) {
    		return si;
    	}
    	int k=index(arr,x,si+1);
    	return k;
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int r1=index(arr,5,0);
		System.out.println(r1);
      
	}

}
