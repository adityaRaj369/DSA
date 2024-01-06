package oops;

public class fraction {
   private int numerator;
   private int denominator;
   public fraction(int numerator,int denominator) throws dividebyzeroException {
	   if(denominator==0) {
		   System.out.println("you created the exception");
		   throw new dividebyzeroException();
	   }
	   this.numerator=numerator;
	   this.denominator=denominator;
   }
   public void print() {
	   System.out.println(numerator+"/"+denominator);
   }
   public int setNumerator(int numerator) {
	   this.numerator=numerator;
	   return numerator;
   }
   public int getNumerator() {
	   return this.numerator;
   }
   public void simplify() {
		int gcd=1;
		int smaller=Math.min(numerator,denominator);
		for(int i=2;i<smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
   public void increment() {
	   numerator=numerator+denominator;
	   simplify();
   }
   public void setdenominator(int num) throws dividebyzeroException {
		if(num==0) {
			throw new dividebyzeroException();
		}
		this.denominator=num;
		simplify();
		
	}
   public int getDenominator() {
	   return this.denominator;
   }
   public void add(fraction f2) {
	   this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
	   this.denominator=this.denominator*f2.denominator;
	   simplify();
   }
   public static fraction add(fraction f1,fraction f2) throws dividebyzeroException {
		int newNUM=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		int newDENO=f1.denominator*f2.denominator;
		fraction f3=new fraction(newNUM,newDENO);
		return f3;
	}
   public static fraction multiply(fraction f1,fraction f2) throws dividebyzeroException {
		int newNUM=f1.numerator*f2.numerator;
		int newDENO=f1.denominator*f2.denominator;
		fraction f4=new fraction(newNUM,newDENO);
		return f4;
		
	}
}
