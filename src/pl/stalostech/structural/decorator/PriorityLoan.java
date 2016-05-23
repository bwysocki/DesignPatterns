package pl.stalostech.structural.decorator;

public class PriorityLoan implements Loan {

	@Override
	public double getIntrest() {
		return 3.5;
	}

}
