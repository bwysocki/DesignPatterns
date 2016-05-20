package pl.stalostech.behavioral.templatemethod;

public class Main {

	public static void main(String[] args) {

		LoanAlgorithm client = new FamilyCustomer();
		client.canOfferLoan();
		
		client = new SingleCustomer();
		client.canOfferLoan();
	}

}
