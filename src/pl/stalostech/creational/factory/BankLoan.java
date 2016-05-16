package pl.stalostech.creational.factory;

import java.math.BigDecimal;

/**
 * Represents traditional loan.
 * 
 * @author Bartosz Wysocki
 *
 */
public class BankLoan implements Loan {

	private BigDecimal amount;
	private BigDecimal intrest;
	private int months;

	public BankLoan(BigDecimal amount, int months, BigDecimal intrest) {
		this.amount = amount;
		this.months = months;
		this.intrest = intrest;
	}

	@Override
	public BigDecimal getLoanAmount() {
		return this.amount;
	}

	@Override
	public int getDurationOfLoanInMonths() {
		return months;
	}

	@Override
	public BigDecimal getIntrest() {
		return intrest;
	}

	@Override
	public String toString() {
		return "BankLoan [getLoanAmount()=" + getLoanAmount() + ", getDurationOfLoanInMonths()="
				+ getDurationOfLoanInMonths() + ", getIntrest()=" + getIntrest() + "]";
	}

}
