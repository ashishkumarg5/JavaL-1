public class VariableScopeDemo{
	
	public static void main(String args[]){
		Vehicle myNewCar = new Vehicle();
		myNewCar.vehicleName = "Hyundai i20";
		myNewCar.noOfTyres = 4;
		myNewCar.isLoadingVehicle = false;
		myNewCar.ownerName = "Sachin";
		
		System.out.println(myNewCar.vehicleName);
		System.out.println(myNewCar.noOfTyres);
		System.out.println(myNewCar.isLoadingVehicle);
		
		System.out.println("-------------Sep----------");
		
		Vehicle myNewBike = new Vehicle();
		myNewBike.vehicleName = "Active 5G";
		myNewBike.noOfTyres = 2;
		myNewBike.isLoadingVehicle = false;
		myNewBike.ownerName = "Rohit";
		
		System.out.println(myNewBike.vehicleName);
		System.out.println(myNewBike.noOfTyres);
		System.out.println(myNewBike.isLoadingVehicle);
		
		
		//class var
		System.out.println(Vehicle.ownerName);
		System.out.println(myNewCar.ownerName);
		System.out.println(myNewBike.ownerName);
	}	
}

//Instance variable need not to be intialized
class Vehicle{
	String vehicleName;	//20 bytes
	int noOfTyres; //4 bytes
	boolean isLoadingVehicle;	//1 bit
	
	//class variable
	static String ownerName = "Virat";
}
