package inheritance;

public  abstract class vehicle {   //if we write public final class vehicle then we will not be able to use this class as inheritence therefore we will gwt an error
   private String color;
   public int MaxSpeed;   //if we use protected here then w can only use it when in class we write extends keyword
   public void print() {   //if we write final in front of public the we will fix the print method and another print methods in any class will throw errors
	   System.out.println("vehicle"+" color "+color+" MaxSpeed "+MaxSpeed);
   }
   public String setcolor(String color){
	   this.color=color;
	   return color;
   }
   public String getcolor() {
	   return color;
   }
   public vehicle() {
	     
	   System.out.println("Vehicles constructer");
	   //int MaxSpeed=100;
   }
   public abstract boolean isMotorized() ;   //without writing vehicle as an abstract method it will throw error
    
   //abstract method helps us to tell the compiler that i don't have the body for this method 
   //by this method we are not forcing all the child class that they are motorized but telling them that they can use it

   //public abstract String getCompany();
}

