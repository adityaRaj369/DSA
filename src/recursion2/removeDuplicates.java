package recursion2;

public class removeDuplicates {
    
	
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1){
			return s;
		}
		String smallAns= removeConsecutiveDuplicates(s.substring(1));
        if(smallAns.charAt(0)==s.charAt(0)){
			return smallAns;
		}
		return s.charAt(0)+smallAns;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeConsecutiveDuplicates("AABCDAABBCERTY"));

	}

}
