package pl.stalostech.structural.bridge;

public class PriorityLoan extends Loan {

	public PriorityLoan(Payment payment) {
		super(payment);
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Doing payment in bridge style");
		this.payment.makePayment(amount);
	}

}
