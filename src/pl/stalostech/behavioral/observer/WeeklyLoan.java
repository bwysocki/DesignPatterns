package pl.stalostech.behavioral.observer;

public class WeeklyLoan extends Loan {

	public WeeklyLoan(BaseIntrest baseIntrest) {
		super(baseIntrest);
	}

	public static final double LOAN_INTREST = 5.7;

	@Override
	protected double getLoanIntrest() {
		return LOAN_INTREST;
	}

	@Override
	protected String getChangeMsg() {
		return "Base intrest changed. New WeeklyLoan intrest = " + this.intrest;
	}

}
