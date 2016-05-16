package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * Concrete factory for Month products.
 * 
 * @author Bartosz Wysocki
 *
 */
public class PriorityProductsFactory extends BankProductsAbstractFactory {

	@Override
	public Loan getLoan(BigDecimal expectedAmount, int expectedDuration) {
		return new PriorityLoan(expectedAmount, expectedDuration);
	}

	@Override
	public Account getAccount() {
		return new PriorityAccount();
	}

}
