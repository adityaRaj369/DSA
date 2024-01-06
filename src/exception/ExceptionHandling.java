package exception;

class myException extends Exception {
    public myException(String notice) {
        super(notice);
    }
}
public class ExceptionHandling {
	public static void main(String [] args) {
		try {
			int age=15;
			if(age<18) {
				throw new myException("Age must be 18 or above");
			}
			else {
				System.out.println("Age is valid");
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught :"+e.getMessage());
		}
		finally {
			System.out.println("Finally Block Executed");
		}
	}
}
