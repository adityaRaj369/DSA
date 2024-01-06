package inheritance;

public class car extends vehicle{
    int numDoors;
//    public void printCar() {
// 	   System.out.println("vehicle"+" color "+getcolor()+" MaxSpeed "+MaxSpeed+" numDoors "+numDoors);
//    }
    public void print() {
    	super.print();//super keyword refers to the parent class
    	System.out.println("vehicle"+" color "+getcolor()+" MaxSpeed "+MaxSpeed+" numDoors "+numDoors);
    }
    public car() {
    	System.out.println("CARS CONSTRUCTER");
    	numDoors=4;
    }
    public car(int numDoors,int Maxspeed) {
    	this.numDoors=numDoors;
    	System.out.println("numdoors"+numDoors);
    }
   public boolean isMotorized() {  //we wrote this to state that the car class which inherited the vehicle class which is in complete will throw error therefore we wrote here the isMotorized method to show that its complete and will not throw error
	   return true;
   }
}
