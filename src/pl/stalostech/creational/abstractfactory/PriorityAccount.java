package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * Priority account for best clients.
 * 
 * @author Bartosz Wysocki
 *
 */
public class PriorityAccount implements Account {

	public static final BigDecimal INTREST = new BigDecimal("1.50");
	public static final BigDecimal FEE = BigDecimal.ZERO;

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
		return "PriorityAccount [getIntrest()=" + getIntrest() + ", getMonthlyFee()=" + getMonthlyFee() + "]";
	}

}
