package pl.stalostech.structural.bridge;

public class PaymentWeek implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("Making weekly payment for amount:" + amount);
	}

}
