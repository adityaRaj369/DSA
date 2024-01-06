package JavaLab;

public class Car extends Vehicle{
    int NumOfDoors;
    public void car(int NumOfDoors,int MaxSpeed) {
    	this.NumOfDoors=NumOfDoors;
    	this.MaxSpeed=MaxSpeed;
    }
    void print() {
    	super.print();
    	System.out.println("Number Of Doors "+NumOfDoors+" MaxSpeed "+MaxSpeed);
    }
    
    
}
