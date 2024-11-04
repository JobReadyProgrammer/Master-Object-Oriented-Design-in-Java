package user;

import remotes.RemoteControl;
import devices.Projector;
import devices.TV;

public class Person {
	
	public static void main (String args[]){
	
		//Devices in the home
		Projector niceProjector = new Projector();
		TV niceLargeScreenTV = new TV();
		
		// The user's control
		RemoteControl remoteControl = RemoteControl.getInstance();
		
		remoteControl.connectToDevice(niceProjector);
		remoteControl.clickOnButon();
		
		remoteControl.connectToDevice(niceLargeScreenTV);
		remoteControl.clickOnButon();

	}
	
}
