package observers;
import domain.Employee;


public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee emp , String msg) {
		System.out.println("HR department notified...");
		System.out.println(msg+ ": " + emp.getName());
	}

}
