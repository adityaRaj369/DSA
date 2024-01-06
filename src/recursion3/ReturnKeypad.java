package recursion3;
import java.util.Scanner;
public class ReturnKeypad {
	
	public static String getOptions(int digits) {
		if(digits==2) {
			return "abc";
		}
		if(digits==3) {
			return "def";
		}
		if(digits==4) {
			return "ghi";
		}
		if(digits==7) {
			return "pqrs";
		}
		return "";
	}
	
	public static String[] keypadCombinations(int input) {
		if(input==0) {
			String[] output=new String[1];
			output[0]="";
			return output;
		}
		String [] smallOutput=keypadCombinations(input/10);   // example if we get input 234 the combilation will be ab etc
		int lastDigit=input%10;    //example it will store 4 as output  example 234  then it will store 4
		String lastDigitsOptions=getOptions(lastDigit);
		String [] output=new String[smallOutput.length * lastDigitsOptions.length()];
		int k=0;
		for(int i=0;i<smallOutput.length;i++) {
			for(int j=0;j<lastDigitsOptions.length();j++) {
				output[k]=smallOutput[i] + lastDigitsOptions.charAt(j);
				k++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("ENTER NUMBER");
       int input=s.nextInt();
       String [] output=keypadCombinations(input);
       for(String sc: output) {
    	   System.out.println(sc);
       }
	}

}
