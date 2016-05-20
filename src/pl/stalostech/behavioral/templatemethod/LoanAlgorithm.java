package pl.stalostech.behavioral.templatemethod;

public abstract class LoanAlgorithm {

	public abstract boolean hasBankProducts();

	public abstract boolean hasValidHistory();

	public abstract boolean hasIncomes();

	public boolean canOfferLoan() {

		if (hasValidHistory()) {
			if (hasIncomes() || hasBankProducts()) {
				return true;
			}
		}

		return false;
	}

}
