package pl.stalostech.creational.factory;

import java.math.BigDecimal;

/**
 * Quick loan for one month with big intrest.
 * @author Bartosz Wysocki
 *
 */
public class MonthLoan implements Loan {

	public static final int DURATION = 1;
	public static final BigDecimal INTREST = new BigDecimal("5.20");

	private BigDecimal amount;

	public MonthLoan(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public BigDecimal getLoanAmount() {
		return amount;
	}

	@Override
	public int getDurationOfLoanInMonths() {
		return DURATION;
	}

	@Override
	public BigDecimal getIntrest() {
		return INTREST;
	}

	@Override
	public String toString() {
		return "MonthLoan [getLoanAmount()=" + getLoanAmount() + ", getDurationOfLoanInMonths()="
				+ getDurationOfLoanInMonths() + ", getIntrest()=" + getIntrest() + "]";
	}

}
