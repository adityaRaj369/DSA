package recursion;

public class checkNumberInArray {
	public static boolean checkNumber(int input[], int x) {
		if(input.length<=1)
	        {
	            if(input[0]==x)
	        return true;
	            else
	                return false;
	        }
	       
	        if(input[0]==x)
	        {
	            return true;
	        }
	        
	        int arr[]=new int[input.length-1];
	        for(int i=1;i<input.length;i++)
	        {
	            arr[i-1]=input[i];
	        }
	        
	        boolean s=checkNumber(arr,x);
	        
	        return s;
		}

	public static void main(String[] args) {
		int x=8;
		int arr[]= {1,2,3,4,5,6,7,8,9};
		boolean r=checkNumber(arr,x);
		System.out.print(r);

	}

}
