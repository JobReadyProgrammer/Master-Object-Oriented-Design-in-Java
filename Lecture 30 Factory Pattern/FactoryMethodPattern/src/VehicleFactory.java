
public class VehicleFactory {
	
	public Vehicle getVehicle( VehicleType vehicleType){
		return vehicleType.getVehicle();
	}
}
