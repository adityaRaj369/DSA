package interfaces;

public class vehicleUse {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		//vehicleInterface vi=new vehicleInterface();  //we cannot create an object of vehicle interface
        vehicleInterface vi;
        vi=new vehicle();  //we can polymorphy it but we cannot create class
        vi.CarCompany();
        System.out.println(vi.CarCompany());
        System.out.println(vi.isMotorized());
       // vi.prnt(); 
	}

}
