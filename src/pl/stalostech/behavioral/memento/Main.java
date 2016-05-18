package pl.stalostech.behavioral.memento;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		BankPayment payment = new BankPayment(new BigDecimal("100.00"), 1);
		BankPaymentCareTaker careTaker = new BankPaymentCareTaker();

		careTaker.addMemento(payment.saveStateToMemento());
		
		payment.getData().setAmount(new BigDecimal("200.00"));
		payment.getData().setPaymentsInMonth(4);
		
		System.out.println(payment);
		
		payment.getStateFromMemento(careTaker.getMementu(0));
		
		System.out.println(payment);
		
	}
}
