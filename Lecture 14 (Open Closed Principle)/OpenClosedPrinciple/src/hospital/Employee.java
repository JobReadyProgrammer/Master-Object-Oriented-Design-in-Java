package hospital;


public abstract class Employee {
	
	private int id;
	private String name;
	private String department;
	private boolean working;
	
	public Employee(int id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	abstract void performDuties();
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department + ", working=" + working + "]";
	}

	
	
	
}
