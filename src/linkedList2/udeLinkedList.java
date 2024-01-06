package linkedList2;

import java.util.Scanner;

public class udeLinkedList {
   
	public static Node<Integer> TakeInput(){  //while taking input of the node make sure that -1 points to the null therefore to stop the input we enter -1
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
	public static void printRecursion(Node <Integer>head) {
		if(head==null) {
			return;
		}
		System.out.println(head.data+" ");   //prints the data of the node
		printRecursion(head.next);   //passes the reference to next node
		//for printing the linkedList in reverse order we put the print statement after recursion is called
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
	public static Node<Integer>ReverseLL(Node<Integer>head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> SmallAns=ReverseLL(head.next);   // this recursion returns the value if input is 1 2 3 4 then it will return 4 3 2 now the head.next is still 2
		head.next.next=head;   //now we connect the 2 with the head and point the new head.next to null so that our ll id reversed
		head.next=null;
		return SmallAns;
	}
	
	public static Node<Integer>MidPoint(Node<Integer>head){
		if(head==null || head.next==null){
			return head;
		}
		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> MergeTwoSortedArrays(Node<Integer>head1,Node<Integer>head2){
		 if(head1==null) {
			 return head2;
		 }
		 if(head2==null) {
			 return head1;
		 }
		Node<Integer>t1=head1,t2=head2;
	    Node<Integer> head=null,tail=null;
		 if(t1.data<=t2.data) {
			 head=t1;
			 tail=t1;
			 t1=t1.next;
		 }
		 else {
			 head=t2;
			 tail=t2;
			 t2=t2.next;
		 }
		 while(t1!=null && t2!=null) {
			 if(t1.data<=t2.data) {
				 tail.next=t1;
				 tail=t1;
				 t1=t1.next;
			 }
			 else {
				 tail.next=t2;
				 tail=t2;
				 t2=t2.next;
			 }
		 }
		 //one list is over now means either of the list became null now we need to check that other list is null or not
		 if(t1!=null) {
			 //means first list is remaining
			 tail.next=t1;
		 }else {
			 tail.next=t2;
		 }
		 return head;
	}
	public static void main(String []args) {
		//Node<Integer> head =TakeInput();
		Node<Integer> head1 =TakeInput();
		Node<Integer> head2 =TakeInput();
		Node<Integer>head=MergeTwoSortedArrays(head1,head2);
		//head=insertRecursive(head,20,2);
		//head=ReverseLL(head);
		//Node<Integer>Mid=MidPoint(head);
		//System.out.print(Mid.data);
		printRecursion(head);
	}
}
