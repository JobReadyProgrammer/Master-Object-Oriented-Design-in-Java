package devices;


public class TV implements Device{

	public void turnOn() {
		SwitchToFavoriteChannel();
		System.out.println("TV has been turned on");
	}

	public void turnOff() {
		turnOnTVAlarm();
		System.out.println("TV has been turned off");
	}

	// below are additional steps that may be required for you to operate your device
	private void SwitchToFavoriteChannel(){
		System.out.println("Switched to your favorite Channel");
	}
	
	private void turnOnTVAlarm(){
		System.out.println("TV Alarm set for you to wake up in the morning");
	}
	
	public String toString(){
		return "Television";
	}


}
