package processes;

public abstract class GeneralManufacturingProcess {
	
	private String processName;
	
	public GeneralManufacturingProcess(String name){
		processName = name;
	}
	
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();
	
	// template method
	public void launchProcess(){
		
		if(processName !=null && !processName.isEmpty()){
		
		packageDevice();
		assembleDevice();
		testDevice();
		storeDevice();
		
		} else{
			System.out.println("no process name was specified");
		}
		
	}
	
}
