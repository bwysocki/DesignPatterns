package pl.stalostech.behavioral.memento;

import java.math.BigDecimal;

public class PaymentData {

	BigDecimal amount;
	
	int paymentsInMonth;
	
	public PaymentData(BigDecimal amount, int paymentsInMonth) {
		this.amount = amount;
		this.paymentsInMonth = paymentsInMonth;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getPaymentsInMonth() {
		return paymentsInMonth;
	}

	public void setPaymentsInMonth(int paymentsInMonth) {
		this.paymentsInMonth = paymentsInMonth;
	}

	@Override
	public String toString() {
		return "PaymentData [amount=" + amount + ", paymentsInMonth=" + paymentsInMonth + "]";
	}
	
}
