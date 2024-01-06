package inheritance;

public class vehicleuse {
     public static void main (String []args) {
    	// vehicle v=new vehicle(); //here we are getting error because we have written abstract to the parent class vehicle and vehicle class is incomplete
    	 vehicle v; //it will not throw any error because we have only created memory reference v not new vehicle v
    	// v.setcolor("RED");
    	 //v.MaxSpeed=320;
    	 //v.print();
    	 
    	 car c=new car();
    	 c.setcolor("BLACK");
    	 c.MaxSpeed=321;
    	 c.numDoors=6;
    	// c.printCar();
    	 c.print();
    	 
    	 bycycle b=new bycycle();
    	 b.setcolor("violet");
    	 b.MaxSpeed=40;
    	 b.print();
    	 
    	// vehicle v1=new car(); //polymorphism
    	// v.MaxSpeed=120;
    	// v.numDoors=4;//because this property is not common for all vehicles therefore shows error
    	 
    	 
     }
}
