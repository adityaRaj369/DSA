package recursion3;
import java.util.Scanner;
public class PrintKeypadCombinations {
      
	public static char[] helper(int n){
		if(n==2){
			char ch[]={'a','b','c'};
			return ch;
		}
		else if(n==3){
			char ch[]={'d','e','f'};
			return ch;
		}
		else if(n==4){
			char ch[]={'g','h','i'};
			return ch;
		}
		else if(n==5){
			char ch[]={'j','k','l'};
			return ch;
		}
		else if(n==6){
			char ch[]={'m','n','o'};
			return ch;
		}
		else if(n==7){
			char ch[]={'p','q','r','s'};
			return ch;
		}
		else if(n==8){
			char ch[]={'t','u','v'};
			return ch;
		}
		else if(n==9){
			char ch[]={'w','x','y','z'};
			return ch;
		}
		else{
			char ch[]={' '};
			return ch;
		}
	}
	public static void printKeypad(int input){
		printKeypad(input,"");
	}
	public static void printKeypad(int input,String s){
		if(input==0){
			System.out.println(s);
			return;
		}
		int remainder=input%10;
		char smallOutput [] =helper(remainder);
		for(int i=0;i<smallOutput.length;i++) {
			printKeypad(input/10,smallOutput[i]+s);
			if(smallOutput.length==4){
				printKeypad(input/10,smallOutput[3]+s);
			}
		}
	}
	
	
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int input=s.nextInt();    // input 23   then output is ad,bd,cd,ae,be,ce,af,bf,cf
		printKeypad(input,"");
	}
}