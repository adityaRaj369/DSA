package oops;

public class student {
   public String name;
   private int rollNo;
   double cgpa;
   static int numStudents;
   final static double CONVERSIONFACTOR=0.97;
   public student(String n,int num) {
	   this.name=n;
	   this.rollNo=num;
	   numStudents++;
   }
   student(String name){
	   this.name=name;
   }
   public void print() {
	   System.out.println(name+" "+rollNo);
   }
   public int getrollNo() {
	   return this.rollNo;
   }
   public void setRollNo(int rollno) {
	   if(rollno<=0) {
		   return;
	   }
	   this.rollNo=rollno;
   }
}
