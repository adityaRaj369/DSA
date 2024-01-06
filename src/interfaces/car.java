package interfaces;

public class car extends vehicle implements vehicleInterface, CarInterface{  //in java we cannot extend multiple class but can implement multiple interface
    public boolean isMotorized() {
    	return true;
    }
    //if there is a clash between two same method and datatype the it will throw an error
    public String CarCompany() {
    	return null;
    }
	public int numGears() {
		// TODO Auto-generated method stub
		return 0;
	}
}
