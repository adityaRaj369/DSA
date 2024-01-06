package oops;
public class DynamicArray {
	   private int data[];
	   private int NextElementIndex;
	   public DynamicArray() {
		   data=new int[5];
		   NextElementIndex=0; 
	   }
	   public int size() {
		   return NextElementIndex;
	   }
	   public boolean isEmpty() {
		   return NextElementIndex==0;
	   }
	   public int get(int i) {
		   if(i>=NextElementIndex) {
			   return -1;
		   }
		   return data[i];
	   }
	   public void add(int elem) {
		   if(NextElementIndex==data.length) {
			   doubleCapacity();
		   }
		   data[NextElementIndex]=elem;
		   NextElementIndex++;
	   }
	   private void doubleCapacity() {
	   int temp[]=data;
	   data=new int[2*data.length];
	   for(int i=0;i<temp.length;i++) {
		   data[i]=temp[i];
	   }}
	   public void set(int i,int elem){
		   if(i>=NextElementIndex) {
			   return ;
		   }
		   data[i]=elem;
	   }
	   public int removelast() {
		   int temp=data[NextElementIndex-1];
		   data[NextElementIndex-1]=0;
		   NextElementIndex--;
		   return temp;
	   }
}
