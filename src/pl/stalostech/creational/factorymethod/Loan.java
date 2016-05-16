package pl.stalostech.creational.factorymethod;

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
