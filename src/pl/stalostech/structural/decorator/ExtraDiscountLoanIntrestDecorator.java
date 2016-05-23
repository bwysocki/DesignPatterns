package pl.stalostech.structural.decorator;

public class ExtraDiscountLoanIntrestDecorator extends LoanIntrestDecorator {

	public ExtraDiscountLoanIntrestDecorator(Loan loan) {
		super(loan);
	}

	@Override
	public double getIntrest() {
		return loan.getIntrest() - 0.5;
	}

}
