
public class PerformanceStage {
	
	private static PerformanceStage INSTANCE = null;
	private static int counter;
	
	// private constructor for singleton
	public PerformanceStage(){
		counter++;
	}
	
	public synchronized static PerformanceStage getInstance(){
		if(INSTANCE == null){
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}
	
	public void turnOnLights(){
		System.out.println("turned on lights...");
	}
	
	public int getCounter(){
		return counter;
	}
}
