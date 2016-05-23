package pl.stalostech.structural.proxy;

public class ClientCreditHistory implements CreditHistory {

	public ClientCreditHistory() {
		System.out.println("Loading credit history from WS.");
	}
	
	@Override
	public void getCreditHistory() {
		System.out.println("Displaying client credit history.");
	}

}
