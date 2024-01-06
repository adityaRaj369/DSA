package JavaLab;

public class Calculator {
     
     public void add(int num1,int num2) {
    	 int c=num1+num2;
    	 System.out.println(c);
     }
     public void add(float num1,float num2) {
    	 float c=num1+num2;
    	 System.out.println(c);
     }
     public void add(double num1,double num2) {
    	 double c=num1+num2;
    	 System.out.println(c);
     }
     public void add(int num1) {
    	 int c=num1;
    	 System.out.println(c);
     }
     public void add(float num1) {
    	 float c=num1;
    	 System.out.println(c);
     }
     public void add(double num1) {
    	 double c=num1;
    	 System.out.println(c);
     }
     public void add(int num1,int num2,int num3) {
    	 int c=num1+num2+num3;
    	 System.out.println(c);
     }
    public static void main(String [] args) {
    	Calculator c=new Calculator();
    	c.add(2,3);
    	c.add(2.0,11.0);
    	c.add(1.222,2.444);
    	c.add(2);
    	c.add(2,3,4);
    	Calculator c1=new Calculator();
    	c1.add(5,3);
    	c1.add(51.1,11.0);
    	c1.add(111.222,2.444);
    	c1.add(2.223);
    	c1.add(55,66,77);
    }
}
