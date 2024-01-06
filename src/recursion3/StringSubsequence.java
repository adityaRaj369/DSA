package recursion3;

import java.util.Scanner;

public class StringSubsequence {
	public static String[] subsequences(String input) {
		if(input.length()==0) {
			String [] output=new String[1];
			output[0]="";                     // if string is abc then sub sequence is["",b,c,bc,a,ab,ac,abc]
			return output;
		}
		String[] SmallOutput=subsequences(input.substring(1));  
		String[] output=new String[2*SmallOutput.length];
		for(int i=0;i<SmallOutput.length;i++) {   //copying all element of substring as ahown in above example from index 0 to 3 
			output[i]=SmallOutput[i];
		}
		for(int i=0;i<SmallOutput.length;i++) {
			output[SmallOutput.length+i]=input.charAt(0)+SmallOutput[i];  //now we copied the elements by multiplying the 0 to 3 index of array with the first character 
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String input=s.next();
		String output[]=subsequences(input);
		for(String outputString : output) {
			System.out.print(outputString+" ");
		}

	}

}
