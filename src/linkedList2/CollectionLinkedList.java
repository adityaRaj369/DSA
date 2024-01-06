package linkedList2;

import java.util.LinkedList;

public class CollectionLinkedList {
  public static void main(String []args) {
	  LinkedList<Integer> list=new LinkedList<Integer>();  //list here is doubly linked list
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(1, 90);
	  list.set(1,60);   //for removing an element and inserting another element
	  //list.remove(1);
	  System.out.println(list.get(2));  //write list. and we will get many options
	  System.out.println(list.size());
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
	  }
  }
}
