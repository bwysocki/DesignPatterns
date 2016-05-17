package pl.stalostech.creational.factorymethod;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientForeignLoanCounter extends ClientAbstractLoanCounter {

	@Override
	protected Set<Loan> makeClientLoans() {
		// get loans from other banks
		return Stream.of(new MonthLoan(new BigDecimal("125000")), new MonthLoan(new BigDecimal("1250")))
				.collect(Collectors.toCollection(HashSet::new));
	}

}
