package pl.stalostech.structural.proxy;

public class Main {

	public static void main(String[] args) {
		
		CreditHistory creditHistory = new ProxyClientCreditHistory();
		System.out.println("Real history will be lazy loaded.");
		creditHistory.getCreditHistory();
		
	}

}
