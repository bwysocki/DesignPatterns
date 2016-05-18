package pl.stalostech.behavioral.observer;

public class PriorityLoan extends Loan {

	public PriorityLoan(BaseIntrest baseIntrest) {
		super(baseIntrest);
	}

	public static final double LOAN_INTREST = 2.4;

	@Override
	protected double getLoanIntrest() {
		return LOAN_INTREST;
	}

	@Override
	protected String getChangeMsg() {
		return "Base intrest changed. New PriorityLoan intrest = " + this.intrest;
	}

}
