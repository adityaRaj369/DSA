package linkedList;
import java.util.ArrayList;
public class ArrayaListDemo {
    //initially an array list is of length 10
	public static void main(String[] args) {
		 ArrayList<Integer>arr=new ArrayList<>();  //we can initialize the array list by giving the length of the array in the brackets()
		 arr.add(50 );
		 arr.add(10);
		 arr.add(1,80);    //add adds the element and puts the removed element to the next or consecutive index
		 arr.set(2, 90);   //set deletes the element and adds the new element
		 arr.add(800);
		 Integer i=2;
		 arr.remove(i);
		 System.out.println(arr.size());
		 System.out.println(arr.get(2));
		 for(int j=0;j<arr.size();j++) {
			 System.out.print(arr.get(j)+" ");
		 }
		 //using enhanced for loop or for each loop
		 for(int k:arr) {
			 System.out.print(k+" ");
		 }
    
	}

}
