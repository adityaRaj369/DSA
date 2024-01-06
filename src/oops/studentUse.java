package oops;

public class studentUse {

	public static void main(String[] args) {
	  student s1=new student("ADITYA",11222526);
	  student s2=new student("VISHAL",11221121);
	  student s3=new student("ABHAY",11222532);
	  s1.name="ADITYA";
	//  s1.rollNo=11222526;
	  s2.name="VISHAL";
	 // s2.rollNo=11221121;
	 // s2.setRollNo(11221121);
	 // s1.setRollNo(11222526);
//	  System.out.println(s1.name+" " + s1.getrollNo());
//	  System.out.println(s2.name+" " + s2.getrollNo());
	  s1.print(); 
	  s2.print();
	  System.out.println(student.numStudents);
	  System.out.println(s2.numStudents);

	}

}
