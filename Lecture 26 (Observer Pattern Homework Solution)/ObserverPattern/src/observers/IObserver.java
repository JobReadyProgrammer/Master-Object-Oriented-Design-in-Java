package observers;
import domain.Employee;


/**
 * This interface defines the method that the subject will call when it 
 * wants to notify its list of observers. This is actually the callback method 
 * from what I understand.
 * @author Screencasts
 *
 */
public interface IObserver {
	void callMe(Employee emp, String msg); // When something changes in the subject it should call this method..
}
