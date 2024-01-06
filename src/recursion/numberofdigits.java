package recursion;

import java.util.Scanner;

public class numberofdigits {
	public static int count(int n){
		 if(n==0){
			 return 0;
		 }
      int smallans=count(n/10);
	   return smallans +1;

}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		System.out.print(count(n));

	}

}
