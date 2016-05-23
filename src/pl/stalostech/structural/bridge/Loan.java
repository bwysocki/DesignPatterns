package pl.stalostech.structural.bridge;

public abstract class Loan {
	
	protected Payment payment;
	
 	public Loan(Payment payment) {
 		this.payment = payment;
 	}
 	
 	public abstract void makePayment(double amount);
	
}
