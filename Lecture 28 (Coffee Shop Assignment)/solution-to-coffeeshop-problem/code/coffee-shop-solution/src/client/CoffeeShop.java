package client;

import coffeeshop.CoffeeAttendent;
import customers.Customer;
import customers.WaitingCustomer;

public class CoffeeShop {
	
	public static void main(String args[]){
		
		
		Customer robert = new Customer("Robert", "French Vanilla");
		Customer bill = new Customer("Bill", "Hot Coffee");
		
		CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
		coffeeAttendent.takeOrder(robert);
		coffeeAttendent.takeOrder(bill);
		
		// prepare drink
		coffeeAttendent.prepareDrink("French Vanilla");
		coffeeAttendent.prepareDrink("Hot Coffee");

		// order up...
		coffeeAttendent.callOutCompletedOrders();
	}
}
