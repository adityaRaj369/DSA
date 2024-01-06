package recursion2;

public class removeX {
    public static String removex(String st) {
    	if(st.length()==1) {
    		if(st.length()<=1)
    		{
    			if(st.charAt(0)=='x')
    			{
    				return "";
    			}
    			else
    				return st;
    			}
    		if(st.charAt(0)=='x')
    		{
    		st=st.substring(1);
    		return removex(st);
    		}
    		return st.charAt(0)+removex(st.substring(1));
    		}
    
    
	public static void main(String[] args) {
		String str="XNXX";
		String str1=removex(str);
	    System.out.print(str1);

	}

}
