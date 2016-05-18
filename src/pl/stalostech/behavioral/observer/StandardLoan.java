package pl.stalostech.behavioral.observer;

public class StandardLoan extends Loan {

	public StandardLoan(BaseIntrest baseIntrest) {
		super(baseIntrest);
	}

	public static final double LOAN_INTREST = 3.2;

	@Override
	protected double getLoanIntrest() {
		return LOAN_INTREST;
	}

	@Override
	protected String getChangeMsg() {
		return "Base intrest changed. New StandardLoan intrest = " + this.intrest;
	}

}
