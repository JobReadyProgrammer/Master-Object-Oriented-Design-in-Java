package devices;

public class Projector implements Device{

	public void turnOn() {
		pullDownProjectorScreen();
		System.out.println("Projector has been turned on");
	}

	public void turnOff() {
		pullUpProjectorScreen();
		System.out.println("Projector has been turned off");
	}


	// below are additional steps that may be required for you to operate your device
	private void pullDownProjectorScreen(){
		System.out.println("Screen has been lowered for viewing");
	}
	
	private void pullUpProjectorScreen(){
		System.out.println("Screen raised back up to close");
	}

	public String toString(){
		return "Projector";
	}
	

}
