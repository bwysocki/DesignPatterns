package pl.stalostech.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class BankPaymentCareTaker {

	private List<BankPaymentMemento> mementos = new ArrayList<>();
	
	public void addMemento(BankPaymentMemento memento) {
		this.mementos.add(memento);
	}
	
	public BankPaymentMemento getMementu(int index) {
		if (mementos.size() > index) {
			return mementos.get(index);
		}
		throw new IllegalArgumentException("Wrong size.");
	}
	
}
