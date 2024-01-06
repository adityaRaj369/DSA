package linkedList;
import java.util.ArrayList;
//we are removing only consecutive duplicate
public class RemoveDuplicate {
    public static ArrayList<Integer> removeDuplicate(int arr[]){
    	ArrayList<Integer> result=new ArrayList<>();
    	result.add(arr[0]);   //0th element will always be there in the array because we are checking the consecutive elements
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]!=arr[i-1]) {
    			result.add(arr[i]);
    		}
    	}
    	return result;
    }
	
	
	
	public static void main(String[] args) {
		int arr[]= {10,20,20,20,30,30,10};
		ArrayList<Integer> result=removeDuplicate(arr);
		for(int j=0;j<result.size();j++) {
			 System.out.println(result.get(j));
		 }
	}
}
