package inheritanceTemp;

import inheritance.vehicle;

public class truck extends vehicle{
     int MaxLoadCapacity;
     public void print() {
  	   System.out.println("vehicle"+" color "+getcolor()+" MaxSpeed "+MaxSpeed+" MaxLoadCapacity "+MaxLoadCapacity);
     }
}
