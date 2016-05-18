package pl.stalostech.behavioral.state;

public class Main {

	public static void main(String[] args) {

		Context context = new Context();

		ActiveLoanInstallmentState activeState = new ActiveLoanInstallmentState();
		activeState.doAction(context);

		context.getState();
		
		StoppedLoanInstallmentState stoppedState = new StoppedLoanInstallmentState();
		stoppedState.doAction(context);
		
		context.getState();
	}

}
