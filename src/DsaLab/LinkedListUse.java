package DsaLab;

import java.util.Scanner;

import linkedList2.Node;

public class LinkedListUse {

	public static void main(String[] args) {
			Node<Integer> head=TakeInput();//createLinkedList();
			//print(head);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 1 to insert in LinkedList");
			System.out.println("Enter 2 to search in LinkedList");
			System.out.println("Enter 3 to Traverse LinkedList");
			System.out.println("Enter 4 to delete element in LinkedList");
			int c=s.nextInt();
			if(c==1) {
				Scanner se=new Scanner(System.in);
				System.out.println("Enter element to insert");
				int e=se.nextInt();
				System.out.println("Enter element's position to insert");
				int position=se.nextInt();
				head=insertRecursive(head,e,position);
				printRecursive(head);
			}
			if(c==2) {
				System.out.println("Enter element To search");
				int nn=s.nextInt();
				int ss=SearchNode(head,nn);
				System.out.println("Element is at index "+ss);
			}
			if(c==3) {
				System.out.println("Traversing LinkedList");
				printRecursive(head);
			}
			if(c==4) {
				System.out.println("Enter elements position to delete ");
				int p=s.nextInt();
				deleteNode(head,p);
				printRecursive(head);
			}
	}
	public static Node<Integer> insertRecursive(Node<Integer>head,int elem,int pos){
		if(head==null && pos>0) {   // for inserting element at last position
			return head;
		}
		if(pos==0) {
			Node<Integer> NewNode=new Node<Integer>(elem);
			NewNode.next=head;
			return NewNode;
		}
		else {
			head.next=insertRecursive(head.next,elem,pos-1);
			return head;
		}
	}
	public static Node<Integer> TakeInput(){  //while taking input of the node make sure that -1 points to the null therefore to stop the input we enter -1
    	System.out.println("Taking input for stop taking Input enter -1");
		Scanner s=new Scanner(System.in);
    	int data=s.nextInt();
    	Node<Integer> head=null,tail=null;
    	while(data!=-1) {
    		Node<Integer> currentNode=new Node<Integer>(data);
    		if(head==null) {
    			head=currentNode;
    			tail=currentNode;
    		}
    		else {
    			tail.next=currentNode;
    			tail=tail.next;
    		}
    		data =s.nextInt();
    	}
    	return head;
    }  
	public static void printRecursive(Node <Integer>head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");   //prints the data of the node
		printRecursive(head.next);   //passes the reference to next node
		//for printing the linkedList in reverse order we put the print statement after recursion is called
	}
	public static int SearchNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> temp=head;
		int count =0;
		while(temp!=null){
			if(temp.data==n){
				return count;
			}
			else{
				temp=temp.next;
				count++;
			}
		}
		return -1;
	}
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// base case
		if(head==null){
			return head;
		}
		// mini solution (if position is 0 the we return the list except 0 position)
		if(pos==0){
			return head.next;
		}
		// recursive call
		head.next=deleteNode(head.next,pos-1);
		return head;
	}
	
	}

