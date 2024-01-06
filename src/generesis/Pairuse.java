package generesis;

public class Pairuse {
    //if a class consists of a single datatype example int then it can be converted to string by help of generesis
	public static void main(String[] args) {
		pair<String,Integer> pInner=new pair<String,Integer>("ab",100);
		pair<pair<String,Integer>,String> P=new pair<>();  //creating a pair object
		P.setFirst(pInner);
		P.setSecond("abcd");
		System.out.println(P.getFirst());
		System.out.println(P.getSecond());
		System.out.println(P.getFirst().getFirst());  //gives the first value of the first pair first part
		System.out.println(P.getFirst().getSecond()); //gives the second value of first pair second part
		
		//pair p=new pair(10,20);   //this is not the way to create an object in generesis.
//		pair<String> ps=new pair<String>("aa","bb");
//		System.out.println(ps.getFirst()+" "+ps.getSecond());
//		//pair<int> ps1=new pair<int>(1,2);  //we are not allowed to write primitive data types
//		pair<Integer> ps1=new pair<Integer>(1,2);
//		System.out.println(ps1.getFirst()+" "+ps1.getSecond());
//		pair<Double> ps2=new pair<Double>(1.2,2.2);
//		System.out.println(ps2.getFirst()+" "+ps2.getSecond());
//		pair<Character> ps3=new pair<Character>('a','b');
//		System.out.println(ps3.getFirst()+" "+ps3.getSecond());
		// we can also pass vehicle class or any class which we created
	}

}
