package clients;

import observers.HRDepartment;
import observers.IObserver;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String [] args){
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
//		 Employee bob = new Employee("Bob", new Date(), 35000, true);
//		 ems.hireNewEmployee(bob);
		 
		 
		ems.modifyEmployeeName(5, "Imtiaz");
	 // ems.modifyEmployeeName(2, "Imtiaz");
	}
}
