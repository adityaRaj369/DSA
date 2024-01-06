package FinalHashMap;
import java.util.ArrayList;
public class Map <K,V>{
     ArrayList<MapNode<K,V>> buckets;   //buckets are each index or element in the array
     int count;
     int numBuckets;
     public Map(){
    	 buckets=new ArrayList<>();
    	 numBuckets=5;
    	 for(int i=0;i<numBuckets;i++) {
    		 buckets.add(null);
    	 }
     }
     private int getBucketIndex(K key) {
    	 int hc=key.hashCode();
    	 int index=hc%numBuckets;
    	 return index;
     }
     public void insert(K key, V value){
    	 int bucketIndex=getBucketIndex(key);
    	 MapNode<K,V> head=buckets.get(bucketIndex);
    	 //element is already there just update its value
    	 while(head!=null) {
    		 if(head.key.equals(key)) {   // here we are checking that if the key is present in the list or not if present then follow below statement
    			 head.value=value;      //when we find the key in the linked list the we update the value of linked list or our key with the new value which we passed
    			 return;
    		 }
    		 head=head.next;
    	 }
    	 //element is not there means insert at 0 TH POSITION of linkedList
    	 head=buckets.get(bucketIndex);  //hear we pointed our head to the first element of our linked list at particular index
    	 MapNode<K,V> newNode =new MapNode<>(key,value);
    	 newNode.next=head;  //now we connected our new node to the previously existing node
    	 buckets.set(bucketIndex, newNode);  //now we connected our new node to the bucketindex
    	 count++;
    	 double loadFactor=(1.0*count)/numBuckets;  //double divided by double will give double output or if integerthen we will gwt 0 therefore we multiplied by 1.0
         if(loadFactor>0.7) {
        	 reHash();
         }
     }
     public double loadFactor() {
    	 return (1.0*count)/numBuckets;
     }
     private void reHash(){
    	 ArrayList<MapNode<K,V>> temp=buckets;  //stored reference of old bucket in temp
    	 buckets=new ArrayList<>();
    	 for(int i=0;i<2*numBuckets;i++) {
    		 buckets.add(null);
    	 }
    	 count=0;
    	 numBuckets=numBuckets*2;
    	 for(int i=0;i<temp.size();i++) {
    		 MapNode<K,V> head=temp.get(i); 
    		 while(head!=null) {
    			 K key=head.key;
    			 V value=head.value;
    			 insert(key,value);   // it is inbuilt function for inserting key and value
    			 head=head.next;
    		 }
    	 }
     }
     public V getValue(K key) {
    	 int bucketIndex=getBucketIndex(key);
    	 MapNode<K,V> head= buckets.get(bucketIndex);
    	 while(head!=null) {
    		 if(head.key.equals(key)) {
    			 return head.value;
    		 }
    		 head=head.next;
    	 }
    	 return null;
     }
     public int size() {
    	 return count;
     }
     public V removeKey(K key) {
    	 int bucketIndex=getBucketIndex(key);
    	 MapNode<K,V> head= buckets.get(bucketIndex);
    	 MapNode<K,V> prev=null;
    	 while(head!=null) {
    		 if(head.key.equals(key)) {
    			 if(prev!=null) {
    				 prev.next=head.next;  // when node in not present in the head
    			 }else{
        			 buckets.set(bucketIndex,head.next);  //setting bucket index to null
        		 }
    			 count--;
    			 return head.value;
    		 }
    		 prev=head;
    		 head=head.next;
    	 }
    	 return null;
     }
     public boolean isPresent(K key){
    	 int bucketIndex=getBucketIndex(key);
    	 MapNode<K,V> head=buckets.get(bucketIndex);
    	 while(head!=null) {
    		 if(head.key.equals(key)) {
    			 return true;
    		 }
    	 }
    	 return false;
     }
}
