package stackUsingLinkedList;
import java.util.Stack;
public class StackCollection {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int elem :arr) {
			stack.push(elem);
		}
		while(!stack.isEmpty()) {
			 System.out.println(stack.pop());
		}
		
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek());  //peek tells us that which element is at the top
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
	}

}
