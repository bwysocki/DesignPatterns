package pl.stalostech.structural.decorator;

public abstract class LoanIntrestDecorator implements Loan{

	protected Loan loan;
	
	public LoanIntrestDecorator(Loan loan) {
		this.loan = loan;
	}
	
}
