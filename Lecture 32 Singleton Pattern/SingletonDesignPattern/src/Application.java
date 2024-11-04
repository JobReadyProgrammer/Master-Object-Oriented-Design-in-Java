
public class Application {

	public static void main(String[] args) {
		
		PerformanceStage stage = PerformanceStage.getInstance();
		
		PerformanceStage stage2 = new PerformanceStage();
		PerformanceStage stage3 = new PerformanceStage();
		PerformanceStage stage4 = new PerformanceStage();
		PerformanceStage stage5 = new PerformanceStage();
		
		System.out.println(stage3.getCounter());
		
	}

}
