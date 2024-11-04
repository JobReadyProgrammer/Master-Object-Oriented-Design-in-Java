package clients;
import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;


public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	
	}
}
