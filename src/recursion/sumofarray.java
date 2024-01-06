package recursion;

public class sumofarray {
	public static int sum(int input[]) {
		
		 if(input.length<=1)
	        {          return input[0];
	      }
	        
	       int arr[]=new int [input.length-1];
	      for(int i=1;i<input.length;i++)       {
	         arr[i-1]=input[i];
	       }
			return sum(arr)+input[0];
	        
		}
	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7,8,9};
		int r=sum(input);
		System.out.print(r);

	}

}
