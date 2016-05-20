package pl.stalostech.behavioral.templatemethod;

public class FamilyCustomer extends LoanAlgorithm {

	@Override
	public boolean hasBankProducts() {
		System.out.println("If married customer has bank products.");
		return true; //mocked
	}

	@Override
	public boolean hasValidHistory() {
		System.out.println("If married customer has valid bank history.");
		return true;
	}

	@Override
	public boolean hasIncomes() {
		System.out.println("If married customer has valid incomes.");
		return true;
	}

}
