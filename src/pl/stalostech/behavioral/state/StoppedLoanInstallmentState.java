package pl.stalostech.behavioral.state;

public class StoppedLoanInstallmentState implements LoanInstallmentState{

	@Override
	public void doAction(Context context) {
		System.out.println("In a stoped state. Installments can NOT be taken.");
	}

}
