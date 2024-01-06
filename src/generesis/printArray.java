package generesis;

public class printArray  {
	
	public static <T /*extends Vehicle*//*extends PrintInterface*/>void printArray(T []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			//arr[i].print();  //remove comment extends vehicle then we can print it
		}
	}

	public static void main(String[] args) {
		Integer arr[]= new Integer[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		String arr1[]= new String[5];
		for(int i=0;i<arr.length;i++) {
			arr1[i]="abcdefghi";
		}
		printArray(arr); 
		printArray(arr1);
		Vehicle v[]=new Vehicle[5];   //array of vehicle reference points to vehicle object
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicle(10*i,"BMW");
		}
		printArray(v); 
	}
}
