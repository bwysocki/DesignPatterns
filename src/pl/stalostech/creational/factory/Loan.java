package pl.stalostech.creational.factory;

import java.math.BigDecimal;

/**
 * 
 * @author Bartosz Wysocki
 */
public interface Loan {
	
	BigDecimal getLoanAmount();
	
	int getDurationOfLoanInMonths();
	
	BigDecimal getIntrest();
}
