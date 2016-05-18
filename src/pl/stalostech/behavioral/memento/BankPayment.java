package pl.stalostech.behavioral.memento;

import java.math.BigDecimal;

public class BankPayment implements BankPaymentOrginator {

	private PaymentData data;

	public BankPayment(BigDecimal amount, int paymentsInMonth) {
		data = new PaymentData(amount, paymentsInMonth);
	}

	@Override
	public BankPaymentMemento saveStateToMemento() {
		PaymentData copy = new PaymentData(data.getAmount(), data.getPaymentsInMonth());
		return new BankPaymentMemento(copy);
	}

	@Override
	public void getStateFromMemento(BankPaymentMemento memento) {
		this.data = memento.getState();
	}

	public PaymentData getData() {
		return data;
	}

	public void setData(PaymentData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BankPayment [data=" + data + "]";
	}

}
