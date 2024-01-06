package exception;

public class exceptiondemo {
	
	public static int fact(int n) throws negativexception {
		if(n<0) {
			throw new negativexception();
		}
		int ans=1;
		for(int i=0;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
    public static int divide(int a,int b) throws dividebyzeroexception {//throws exception keyword passes the exception to the main where it is called
    	if(b==0) {
    		//throw new ArithmeticException();
    		throw new dividebyzeroexception();
    	}
    	return a/b;
    }
    public static void main(String []args){
    	try {
			divide(10,0);//if 0 is removed by any non zero value then the next exception will be excuted
			System.out.println(fact(-1));
			System.out.println("within try");
		} catch (dividebyzeroexception e) {
			// TODO Auto-generated catch block
			System.out.println("divide by zero exception raised");
			//e.printStackTrace();
		
		} catch (negativexception e) {//this is exception for -ve number factorial
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("catch for negative number exception");
		}
    	catch(Exception e) {
    		System.out.println("generic exception");//if we delete both catch above then this catch that is generic exception will be thrown
    	}
    	finally {
    		System.out.println("finally");// it will be executed compulsarily either exception occurs or not
    	}
    	System.out.println("main");
    }
}
