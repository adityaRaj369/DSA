package recursion2;

public class recursionWithString {
	
	public static String replaceStringchar(String s,char a,char b) {
		if(s.length()==0) {
			return s;
		}
		String smallString=replaceStringchar(s.substring(1),a,b);
		if(s.charAt(0)==a) {
			return b+smallString;
		}
		else {
			return s.charAt(0)+smallString;
		}
	}
   public static void main(String args[]) {
	   String str="ADITYA";
	   char a='A';
	   char b='b';
	   System.out.print(replaceStringchar(str,a,b));
	   
   }
}
