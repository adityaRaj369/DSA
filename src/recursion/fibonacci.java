package recursion;

public class fibonacci {
    
	public static int fib(int n) {
		if(n==1  || n==2) {           //for two cases we need to check the two values
			return 1;
		}
		int fib_at_1=fib(n-1);
		int fib_at_2=fib(n-2);
		int output=fib_at_1+fib_at_2;     //extended for of principle of mathematical induction that previous least values are available for us
		return output;
	}
	
	
	
	public static void main(String[] args) {
		
         System.out.print(fib(5));
	}

}
