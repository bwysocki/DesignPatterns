package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * Represents client account.
 * @author Bartosz Wysocki
 *
 */
public interface Account {
	
	BigDecimal getIntrest();
	
	BigDecimal getMonthlyFee();
	
}
