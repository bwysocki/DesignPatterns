package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * Concrete factory for Month products.
 * @author Bartosz Wysocki
 *
 */
public class MonthProductsFactory extends BankProductsAbstractFactory {

	@Override
	public Loan getLoan(BigDecimal expectedAmount, int expectedDuration) {
		if (expectedDuration != 1) {
			throw new IllegalArgumentException("Wrong expectedDuration.");
		}
		return new MonthLoan(expectedAmount);
	}

	@Override
	public Account getAccount() {
		return new MonthAccount();
	}

}
