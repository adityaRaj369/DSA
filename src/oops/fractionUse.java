package oops;



public class fractionUse {

	public static void main(String[] args) throws dividebyzeroException {
	   fraction f1=new fraction(4,6);  // here if denom is zero then it throws exception which we created
	   fraction f2=new fraction(4,8);
	   //or except writing throws we can write try catch as written below
//	   fraction f2;
//		try {
//			f2 = new fraction(4,8);
//		} catch (dividebyzeroException e) {
//			// TODO Auto-generated catch block
//		    f2=new fraction(4,1); 
//			e.printStackTrace();
//		}
	   f1.print();
	   f1.setNumerator(12);
	   f1.getNumerator();
	   f1.simplify();
	  // f1.setdenominator(0);   //divide by zero exception will be raised which we created
	   f1.increment();
	   f2.simplify();
	   f2.print();
	   f1.add(f2);
	   f1.print();
	   fraction f3=fraction.add(f1, f2);
	   f3.print();
	   fraction f4=fraction.multiply(f1,f2);
       f4.print();
	   
	   
	   

	}

}
