package pl.stalostech.behavioral.state;

public class ActiveLoanInstallmentState implements LoanInstallmentState{

	@Override
	public void doAction(Context context) {
		System.out.println("In a active state. Installments can be taken.");
	}

}
