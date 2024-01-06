package recursion;

public class recursion1 {
    public static int fact(int n) {
    	if(n==0) {
    		return 1;    //the function after calling itself multiple times reaches a point to -infnity thefore we returned 1 at value of function at 0
    	}
    	int smallerOutput=fact(n-1);
    	int output=n*smallerOutput;
    	return output;
    }
    public static int sumN(int n) {
    	if(n==1) {
    		return 1;
    	}
    	int smallestOutput=sumN(n-1);
    	int output=n+smallestOutput;
    	return output;
    }
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(sumN(5));
	}
}