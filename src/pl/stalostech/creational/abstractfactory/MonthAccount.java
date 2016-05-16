package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * Priority account for best clients.
 * 
 * @author Bartosz Wysocki
 *
 */
public class MonthAccount implements Account {

	public static final BigDecimal INTREST = BigDecimal.ZERO;
	public static final BigDecimal FEE = new BigDecimal("10.00");

	@Override
	public BigDecimal getIntrest() {
		return INTREST;
	}

	@Override
	public BigDecimal getMonthlyFee() {
		return FEE;
	}

	@Override
	public String toString() {
		return "MonthAccount [getIntrest()=" + getIntrest() + ", getMonthlyFee()=" + getMonthlyFee() + "]";
	}

}
