package pl.stalostech.behavioral.templatemethod;

public class SingleCustomer extends LoanAlgorithm {

	@Override
	public boolean hasBankProducts() {
		System.out.println("If single customer has bank products.");
		return true; //mocked
	}

	@Override
	public boolean hasValidHistory() {
		System.out.println("If single customer has valid bank history.");
		return false;
	}

	@Override
	public boolean hasIncomes() {
		System.out.println("If single customer has valid incomes.");
		return true;
	}

}
