package inheritance;

public class bycycle extends vehicle {
	public void print() {
		   System.out.println("vehicle"+" color "+getcolor()+" MaxSpeed "+MaxSpeed);
	   }
	public boolean isMotorized() {  //we wrote this to state that the car class which inherited the vehicle class which is in complete will throw error therefore we wrote here the isMotorized method to show that its complete and will not throw error
		   return false;
	   }
}
