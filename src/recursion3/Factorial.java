package recursion3;

public class Factorial {
     public static void Factorial(int input,int answer) {
    	 if(input==0) {
    		 System.out.print(answer);
    		 return;
    	 }
    	 answer=answer*input;
    	 Factorial(input-1,answer);
    	 
     }
     public static void main(String [] args) {
    	 int n=5;
    	 Factorial(n,1);
     }
}
