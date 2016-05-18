package pl.stalostech.behavioral.memento;

public interface BankPaymentOrginator {

	BankPaymentMemento saveStateToMemento();

	void getStateFromMemento(BankPaymentMemento	memento);
}
