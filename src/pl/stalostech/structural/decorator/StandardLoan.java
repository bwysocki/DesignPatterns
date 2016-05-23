package pl.stalostech.structural.decorator;

public class StandardLoan implements Loan {

	@Override
	public double getIntrest() {
		return 4.5;
	}

}
