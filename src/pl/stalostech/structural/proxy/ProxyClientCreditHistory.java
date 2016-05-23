package pl.stalostech.structural.proxy;

public class ProxyClientCreditHistory implements CreditHistory {

	private CreditHistory clientCreditHistory;
	
	@Override
	public void getCreditHistory() {
		if (clientCreditHistory == null) {
			clientCreditHistory = new ClientCreditHistory();
		}
		clientCreditHistory.getCreditHistory();
	}

}
