package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

	public SmartphoneManufacturingProcess(String name) {
		super(name);
	}

	@Override
	protected void assembleDevice() {
		System.out.println("assembled smartphone");
	}

	@Override
	protected void testDevice() {
		System.out.println("tested smartphone");
		
	}

	@Override
	protected void packageDevice() {
		System.out.println("packaged smartphone");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("stored smartphone");
		
	}

}
