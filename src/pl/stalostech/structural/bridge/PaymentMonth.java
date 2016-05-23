package pl.stalostech.structural.bridge;

public class PaymentMonth implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("Making monthly payment for amount:" + amount);
	}

}
