
public class AccountsReceivable {

	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting aTransaction){
		transactionObject = aTransaction;
	}
	
	
	public void postPayment(){
		transactionObject.chargeCustomer();
	}

	public void sendInvoice(){
		transactionObject.prepareInvoice();
		// sends the invoice
	}

}
