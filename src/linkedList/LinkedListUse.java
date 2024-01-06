package linkedList;
import java.util.Scanner;
public class LinkedListUse {
	public static Node<Integer> createLinkedList() {
		Node <Integer>n1=new Node<>(10);
		Node <Integer>n2=new Node<>(20);
		Node <Integer>n3=new Node<>(30);
		Node <Integer>n4=new Node<>(40);
		n1.next=n2;   //we are attatching reference of next element with the reference of another element
		//System.out.println("n1 "+n1+" data "+n1.data+" next "+n1.next);
		n2.next=n3;
		//System.out.println("n2 "+n2+" data "+n2.data+" next "+n2.next);
		n3.next=n4;
		//System.out.println("n3 "+n3+" data "+n3.data+" next "+n3.next);
		//System.out.println("n4 "+n4+" data "+n4.data+" next "+n4.next);
		return n1;
	}
    public static void print(Node<Integer>head) {
    	System.out.println(head.data);
    	System.out.println(head.next);
    	System.out.println(head.next.data);
    	System.out.println(head.next.next.data);
    	System.out.println(head.next.next.next.data);
    }
    //or we can make the another to print the node easily
    public static void print1(Node<Integer>head) {
    	Node<Integer> temp=head;
    	while(temp!=null){
    	//temp.data++;  //it can be used to increment all the values in the node
    	System.out.println(temp.data);
    	temp=temp.next;
    	}
    }
    public static void increment(Node<Integer>head) {
    	head.data++;
    }
    public static Node<Integer> TakeInput(){  //while taking input of the node make sure that -1 points to the null therefore to stop the input we enter -1
    	Scanner s=new Scanner(System.in);
    	int data=s.nextInt();
    	Node<Integer> head=null,tail=null;
    	while(data!=-1) {
    		Node<Integer> currentNode=new Node<Integer>(data);
    		if(head==null) {
    			head=currentNode;  //address of the current is stored in had
    			tail=currentNode;  //address of current node is also stored in tail
    		}
    		//now again input is taken after that else is executed
    		else {
    			tail.next=currentNode;
    			tail=tail.next;
    		}
    		data =s.nextInt();
    	}
    	return head;
    }  
    public static Node<Integer> insert(Node<Integer>head,int elem,int pos){  // pos=position
    	Node<Integer>NodeToBeInserted=new Node<Integer>(elem);
    	if(pos==0) {      
    		NodeToBeInserted.next=head;
    		return NodeToBeInserted;
    	}
    	else {
    	int count=0;
    	Node<Integer>last=head;
    	while(count<pos-1 && last!=null) {
    		count++;
    		last=last.next;
    	}
    	if(last!=null) {   //this if statement is for managing the inserted element at last position so that we would not get any error
    	NodeToBeInserted.next=last.next;
    	last.next=NodeToBeInserted;
    	}
    	return head;
    	}
    }
	public static void main(String[] args) {
		//Node n1;  //this id reference just for remembering
		//n1=new Node(10);   //this is object of the reference
		Node<Integer> head=TakeInput();          //createLinkedList();
		//print(head);
		//increment(head);
		head=insert(head,80,0);
		print1(head);
//		Node <Integer>n1=new Node<>(10);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
	}
}