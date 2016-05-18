package pl.stalostech.behavioral.state;

public class Context {
	
	private LoanInstallmentState state;

	public Context() {
		state = null;
	}

	public void setState(LoanInstallmentState state) {
		this.state = state;
	}

	public LoanInstallmentState getState() {
		return state;
	}

}
