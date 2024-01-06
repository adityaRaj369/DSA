package generesis;

public class Vehicle implements PrintInterface {
   int MaxSpeed;
   String Company;
   public Vehicle(int MaxSpeed,String Company) {
	   this.MaxSpeed=MaxSpeed;
	   this.Company=Company;
   }
   public void print() {
	   System.out.println(MaxSpeed+" "+Company);
   }
}
