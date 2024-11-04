package customers;


// Observer
public interface WaitingCustomer {

	void orderReady(String preparedDrink);
	public String getName();
	public String getDrinkOrdered();
}
