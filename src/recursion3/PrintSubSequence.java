package recursion3;
import java.util.Scanner;
public class PrintSubSequence {
    
	public static void PrintSubSequences(String input,String stringSoFar) {
		if(input.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		String smallInput=input.substring(1);
		PrintSubSequences(smallInput,stringSoFar);
		PrintSubSequences(smallInput,stringSoFar+input.charAt(0));
	}
	
	public static void main(String [] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("ENTER STRING");
		String input=s.next();
		PrintSubSequences(input,"");
	}
}
