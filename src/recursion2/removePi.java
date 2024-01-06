package recursion2;

public class removePi {
	
	public static String replacePi(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			//call recursion of string of length(n-2)
			String smallOutput=replacePi(s.substring(2));
			return "3.14"+smallOutput;
		}
		else {
			//call recursion on string of length (n-2)
			String smallOutput=replacePi(s.substring(1));  //ex apipi
			return s.charAt(0)+smallOutput;
		}
	}

	public static void main(String[] args) {
		System.out.print(replacePi("apiapiapiapiapi"));

	}

}
