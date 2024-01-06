package recursion;

import java.util.Scanner;

public class printNumbers {
	public static void print1(int n){
		//Write your code here
		if(n==0){
			return ;
		}
		print1(n-1);
		System.out.println(n);
		
        }
	public static void print2(int n){
		//Write your code here
		if(n==0){
			return ;
		}
		System.out.println(n);
		print1(n-1);
		
		
}
	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		print1(n);
		print2(n);
}
}