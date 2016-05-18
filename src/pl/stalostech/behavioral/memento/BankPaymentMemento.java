package pl.stalostech.behavioral.memento;

public class BankPaymentMemento {

	PaymentData data;

	public BankPaymentMemento(PaymentData data) {
		this.data = data;
	}

	public PaymentData getState() {
		return data;
	}

}
