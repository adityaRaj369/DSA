package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class queueInCollections {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(30);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());  //for deleting the front element
        
        
	}

}
