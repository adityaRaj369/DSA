package recursion2;

public class checkPalindrome {
	
	public static boolean ispalindrome(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return ispalindrome(s.substring(1,s.length()-1));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABA";
		System.out.println(ispalindrome(s));
	}
}
