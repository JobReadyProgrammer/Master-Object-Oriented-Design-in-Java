package domain.dao;
import domain.Employee;

public class EmployeeDAO {

	public EmployeeDAO() {
		
	}

	public void saveEmployee(Employee employee) {

	// Commented out below just to show you how you would go about "really" saving an employee to a database
	// But since that's not the objective of this lesson, I've left a simple implementation.
		
		/**
			DatabaseConnectionManager databaseConnection = DatabaseConnectionManager
					.getManagerInstance();
			databaseConnection.connect();
	
			DatabaseConnectionManager.getManagerInstance().getConnectionObject()
					.prepareStatement("some sql... ");
			databaseConnection.disconnect();
			*/
			
		System.out.println("saved employee to database");
		
	}

	public void removeEmployee(Employee employee){
				
		//	DatabaseConnectionManager.getManagerInstance().getConnectionObject()
		//		.prepareStatement("some sql... ");
	
		System.out.println("removed employee from database");	
	}
	
}