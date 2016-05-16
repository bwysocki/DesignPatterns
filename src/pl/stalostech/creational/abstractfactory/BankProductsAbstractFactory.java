package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

/**
 * 
 * @author Bartosz Wysocki
 *
 */
public abstract class BankProductsAbstractFactory {
	
	enum ClientType {
		SHORT_TIME_CLIENT, PRIORITY_CLIENT
	}
	
	public abstract Loan getLoan(BigDecimal expectedAmount, int expectedDuration);
	
	public abstract Account getAccount();
	
}
