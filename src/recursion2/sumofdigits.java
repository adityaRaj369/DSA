package recursion2;

public class sumofdigits {
    public static int sumOfDigits(int n) {
    	if(n==0) {
    		return 0;
    	}
    	int smallOutput=sumOfDigits(n/10);
    	return (n%10)+smallOutput;
    }
	public static void main(String[] args) {
		System.out.print(sumOfDigits(123));
	}
}
