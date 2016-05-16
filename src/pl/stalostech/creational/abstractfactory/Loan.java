package pl.stalostech.creational.abstractfactory;

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
