package stack;
import stackUsingLinkedList.StackUsingLL;
public class StackUse {
	public static void main(String[] args) throws StackEmptyException, StackFullException {
		 StackUsingArray stack = new StackUsingArray();
		 //StackUsingLL<Integer> stack= new StackUsingLL<>();
//            int arr[]= {1,2,3,4,5,6,7};
//            for(int i=0;i<arr.length;i++) {
//            	stack.push(arr[i]);
//            }
//            while(! stack.isEmpty()){
//            	System.out.println(stack.pop());
//            }
	        stack.push(10);
	        stack.push(11);
	        stack.push(0);
	        System.out.println(stack.top());
	        //stack.pop();
	        //stack.size();
	        System.out.println(stack.isEmpty());
	        stack.isEmpty();
	    }
	}