package vehicles;

public class Engine {

	private String engineType;
	public Engine(String engineType){
		this.engineType = engineType;
	}
	public void startEngine(){
		System.out.println("started "+engineType+" engine");
	}
}
