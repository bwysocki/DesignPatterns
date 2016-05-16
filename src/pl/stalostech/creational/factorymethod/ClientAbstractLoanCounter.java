package pl.stalostech.creational.factorymethod;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Demonstrates factory method
 * @author Bartosz Wysocki
 *
 */
public abstract class ClientAbstractLoanCounter {

	// factory method
	protected abstract Set<Loan> makeClientLoans();

	public BigDecimal countAllClientLoans() {
		BigDecimal counted = BigDecimal.ZERO;

		Set<Loan> loans = makeClientLoans();
		for (Loan loan : loans) {
			counted = counted.add(loan.getLoanAmount());
		}

		return counted;
	}

}
