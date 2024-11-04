package vehicles;

public class Vehicle {
	
	Engine engine = new Engine("6 liter");
	
//	public Vehicle (Engine engine){
//		this.engine = engine;
//	}

	public void crankIgnition(){
		engine.startEngine();
		System.out.println("Vehicle is running");
	}
	
}
