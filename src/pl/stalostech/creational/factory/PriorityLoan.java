package pl.stalostech.creational.factory;

import java.math.BigDecimal;

/**
 * Priority loan for best clients.
 * @author Bartosz Wysocki
 *
 */
public class PriorityLoan implements Loan {

	public static final BigDecimal INTREST = new BigDecimal("3.50");

	private BigDecimal amount;
	private int duration;

	public PriorityLoan(BigDecimal amount, int duration) {
		this.amount = amount;
		this.duration = duration;
	}

	@Override
	public BigDecimal getLoanAmount() {
		return amount;
	}

	@Override
	public int getDurationOfLoanInMonths() {
		return duration;
	}

	@Override
	public BigDecimal getIntrest() {
		return INTREST;
	}

	@Override
	public String toString() {
		return "PriorityLoan [getLoanAmount()=" + getLoanAmount() + ", getDurationOfLoanInMonths()="
				+ getDurationOfLoanInMonths() + ", getIntrest()=" + getIntrest() + "]";
	}

}
