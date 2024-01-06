package QueueUsingTwoStacks;
import java.util.Scanner;
import java.util.Stack;
public class QueueUsing2Stacks {
	Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        peek();
        return output.pop();
    }
    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }
    public boolean empty() {
        return input.empty() && output.empty();
    }
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int size = 0;
    	QueueUsing2Stacks queue = new QueueUsing2Stacks();
    		System.out.println("Enter number of element to insert ");
        	int n=s.nextInt();
        	size=n;
        	for(int i=0;i<n;i++) {
        		System.out.println("Enter "+i +" th element to push");
        		int n1=s.nextInt();
        		queue.push(n1);
        	}
        System.out.println("Dequeue: " + queue.peek());
        System.out.println("Is empty: " + queue.empty());
        for(int i=0;i<size;i++) {
			System.out.println(i+" th Element popped out that is = "+ queue.pop());
    	}
    }
}
