package Tree;
import java.util.Scanner;
import Queue.queuwUsingLinkedLIst;
import Queue.QueueEmptyException;
public class TreeTest {
    
	public static void printTreePreorder(TreeNode<Integer> root) {
		//it is not the base case it is the special case to handle when we have passed the root as null and it will not throw error
		if(root==null){
			return;
		}
		System.out.print(root.data+": ");
		//below code is for printing all the data of the node before another childrens children is printed
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> child=root.children.get(i);
			printTreePreorder(child);
		}
	}
	public static int NumNode(TreeNode<Integer> root) {
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			int childrenCount=NumNode(root.children.get(i));
			count+=childrenCount;
		}
		return count;
	}
	 public static TreeNode<Integer> takeInput() throws QueueEmptyException{
	        Scanner s= new Scanner(System.in);
	        QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
	        System.out.println("Enter the root data ");
	        int rootData= s.nextInt();
	        if(rootData==-1) {
	            return null;}

	        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
	        pendingNodes.enQueue(root);

	        while(!pendingNodes.isEmpty()){
	            TreeNode<Integer> front= pendingNodes.deQueue();
	            System.out.println("Enter no. of children "+ front.data);
	            int numChild= s.nextInt();
	            for(int i=1;i<=numChild;i++){
	                System.out.println("Enter the  "+i+" th child data"+ front.data);
	                int childData= s.nextInt();
	                TreeNode<Integer> childNode= new TreeNode<>(childData);
	                front.children.add(childNode);
	                pendingNodes.enQueue(childNode);
	            }
	        }
	        return root;
	    }
	public static void main(String[] args) throws QueueEmptyException {
//		TreeNode<Integer> root=new TreeNode<>(4);
//		TreeNode<Integer> node1=new TreeNode<>(2);
//		TreeNode<Integer> node2=new TreeNode<>(3);
//		TreeNode<Integer> node3=new TreeNode<>(1);
//		TreeNode<Integer> node4=new TreeNode<>(5);
//		TreeNode<Integer> node5=new TreeNode<>(6);
//		//below are the children of the root
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		//below are the children of the root children
//		node2.children.add(node4);
//		node2.children.add(node5);
		TreeNode<Integer> root=takeInput();
		printTreePreorder(root);
		System.out.println(NumNode(root));
	}

}
