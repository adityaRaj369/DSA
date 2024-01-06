package recursion;
import java.util.Scanner;
public class calculatepower {
	public static int power(int x, int n) {   //x to the power n
		 if(n==0)
	        {
	            return 1;
	            
	        }
	        return power(x,n-1)*x;
			
		}
	public static void main(String []args) {
		Scanner s= new Scanner (System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.print(power(x,n));
		
		
		
	}
}
