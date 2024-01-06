package BinaryTrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreesUse {
	public static BinaryTreeNode<Integer>takeTreeInput(){
		System.out.println("Enter root data");
		Scanner s=new Scanner(System.in);
		int rootData=s.nextInt();
		if (rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeTreeInput();
		BinaryTreeNode<Integer> rightChild=takeTreeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}
	
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int largestLeft=largest(root.left);
		int largestRight=largest(root.right);
		return Math.max(root.data,Math.max(largestLeft, largestRight));
	}
	public static int  numLeaves(BinaryTreeNode<Integer> root){  //numLeaves means we are searching for root which dont have any child
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return numLeaves(root.left)+numLeaves(root.right);
	}
	
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return 1 + Math.max(leftHeight,rightHeight);
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		if(Math.abs(leftHeight-rightHeight)>1) {
			return false;
		}
		boolean isLeftBalanced=isBalanced(root.left);
		boolean isRightBalanced=isBalanced(root.right);
		return isLeftBalanced && isRightBalanced;
	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height=0;
			boolean isBal=true;
			BalancedTreeReturn ans=new BalancedTreeReturn();
			ans.height=height;
			ans.isBalanced=isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput=isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput=isBalancedBetter(root.right);
		boolean isBal=true;
		int height=1 + Math.max(leftOutput.height,rightOutput.height);
		if(Math.abs(leftOutput.height - rightOutput.height)>1) {
			 isBal=false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced ) {
			isBal=false;
		}
		BalancedTreeReturn ans=new BalancedTreeReturn();
		ans.height=height;
		ans.isBalanced=isBal;
		return ans;
	}
	public static BinaryTreeNode<Integer> BuildTreeHelper(int[] pre,int []in,int siPre,int eiPre,int siIn,int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootData=pre[siPre];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		int RootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {  //for finding the root in in order
			if(in[i]==rootData) {
				RootIndex=i;
				break;
			}
		}
		int siPreLeft=siPre+1;
		int siInLeft=siIn;
		int eiInLeft=RootIndex-1;
		int eiPreRight=eiPre;
		int siInRight=RootIndex+1;
		int eiInRight=eiIn;
		int LeftSubTreeLength=eiInLeft-siInLeft+1;
		int eiPreLeft=siPreLeft+LeftSubTreeLength-1;
		int siPreRight=eiPreLeft+1;
		BinaryTreeNode<Integer> left=BuildTreeHelper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
		BinaryTreeNode<Integer> right=BuildTreeHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
		root.left=left;
		root.right=right;
		return root;
		
	}
	public static BinaryTreeNode<Integer> BuiltTreeUsintInorAndPreOrder(int pre[],int in[]){
		BinaryTreeNode<Integer> root=BuildTreeHelper(pre,in,0,pre.length-1,0,in.length-1);
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of" + parentData);
			}
			else {
				System.out.println("Enter right child of" + parentData);
			}
		}
		Scanner s=new Scanner(System.in);
		int rootData=s.nextInt();
		if (rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeTreeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}
	public static BinaryTreeNode<Integer> takeInputLevellWise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren =new LinkedList<BinaryTreeNode<Integer>>();   //this queue is for nodes whose children are pending
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingChildren.poll();
			System.out.println("Enter left child of "+front.data);
			int left=s.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println("Enter right child of "+front.data);
			int right=s.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pendingChildren.add(rightChild);
			}  
		}
		return root;
	}
	public static boolean SearchBst(BinaryTreeNode<Integer> root,int data) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}if (root.data<data){
			return SearchBst(root.right,data);
		}
			return SearchBst(root.left,data);
	}
	
	
	public static void printTree(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	
	
	//time complexityO(n) below function while previour isBST was o(logn)
	public static isBStReturn isBST2(BinaryTreeNode<Integer> root) {
		if(root==null) {
			isBStReturn ans=new isBStReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			return ans;
		}
		isBStReturn leftAns=isBST2(root.left);
		isBStReturn rightAns=isBST2(root.right);
		int min=Math.min(root.data,Math.min(leftAns.min,rightAns.min));
		int max=Math.max(root.data,Math.max(leftAns.max,rightAns.max));
		boolean isBST=true;
		if(leftAns.max>=root.data) {
			isBST=false;
		}
		if(rightAns.min<root.data) {
			isBST=false;
		}
		if(!leftAns.isBST) {
			isBST=false;
		}
		if(!rightAns.isBST) {
			isBST=false;
		}
		isBStReturn ans=new isBStReturn(min,max,isBST);
		return ans;
	}
	public static boolean isBST3(BinaryTreeNode<Integer> root,int minRange,int maxRange) {
		if(root==null) {
			return true;
		}
		if(root.data<minRange || root.data>maxRange) {
			return false;
		}
		boolean isLeftWithinRange=isBST3(root.left, minRange,root.data-1);
		boolean isRightWithinRange=isBST3(root.right, root.data,maxRange);
		return isLeftWithinRange && isRightWithinRange;
	}
	
	
	
	public static int numNodes(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return 0; 
		}
		int leftNodeCount=numNodes(root.left);
		int rightNodeCount=numNodes(root.right);
		return 1+leftNodeCount+rightNodeCount;
	}
	
	public static void printDepthElement(BinaryTreeNode<Integer> root,int depth) {
		if(root==null) {
			return;
		}
		if(depth==0) {
			System.out.println(root.data);
			return;
		}
		printDepthElement(root.left,depth-1);
		printDepthElement(root.right,depth-1);
	}
	
	
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer>root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {  //if both are null means root is a leaf and after deleting leaf nothing will be left therefore we return null
			return null;
		}
		root.left=(root.left);
		root.right=(root.right);
		return root;
	}
	
	public static int minimum(BinaryTreeNode<Integer> root){
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin=minimum(root.left);
		int rightMin=minimum(root.right);
		return Math.min(root.data,Math.min(leftMin, rightMin));
	}
   
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftMax=largest(root.left);
		if(leftMax>=root.data) {
			return false;
		}
		int rightMin=minimum(root.right);
		if(rightMin<root.data) {
			return false;
		}
		boolean isLeftBst=isBST(root.left);
		boolean isRightBst=isBST(root.right);
		return isLeftBst && isRightBst;
	}
	public static ArrayList<Integer> NodeToRootPath(BinaryTreeNode<Integer> root , int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer>output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput=NodeToRootPath(root.left,x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput=NodeToRootPath(root.right,x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
		
	}
	
	
	
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<Integer>(3);
//		root.left=rootLeft;
//		root.right=rootRight;
//		BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<Integer>(5);
//		rootLeft.right=twoRight;
//		rootRight.left=threeLeft;
		//BinaryTreeNode<Integer> root=takeTreeInputBetter(true,0,true);  //first true is compulsary because we are taking parent data else we can write 0 and true
		//BinaryTreeNode<Integer> root=takeInputLevellWise();
		//printTree(root);
		//System.out.println("Largest of node is "+largest(root));
		//System.out.println("Number of nodes is "+numNodes(root));
		//System.out.println("Number of leaves is "+numLeaves(root));
		//printDepthElement(root,2);
		//BinaryTreeNode<Integer> newRoot=removeLeaves(root);
		//printTree(newRoot);
		//System.out.print("is Balanced "+isBalancedBetter(root).isBalanced);
		int in[]= {1,2,3,4,5,6,7};
		int pre[]= {4,2,1,3,6,5,7};
		BinaryTreeNode<Integer> root = BuiltTreeUsintInorAndPreOrder(pre,in);
		printTree(root);
		System.out.println(SearchBst(root,30));
		System.out.println(isBST(root));
		isBStReturn ans=isBST2(root);
		System.out.println(ans.min+" "+ans.max+" "+ans.isBST);
		
		
		}
}