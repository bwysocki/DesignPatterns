package pl.stalostech.creational.factory;

import java.math.BigDecimal;

/**
 * 
 * @author Bartosz Wysocki
 *
 */
public class LoanFactory {
	
	enum ClientType {
		NEW_CLIENT, PRIORITY_CLIENT, OLD_CLIENT
	}
	
	public static Loan getLoanForClient(ClientType criteria, BigDecimal requestedAmount, int requestedDurationInMonths) {
		if (criteria == ClientType.NEW_CLIENT) {
			if (requestedDurationInMonths < 12) {
				return new MonthLoan(requestedAmount);
			} else if (requestedDurationInMonths < 36) {
				return new BankLoan(requestedAmount, requestedDurationInMonths, new BigDecimal("4.50"));
			} else {
				return new BankLoan(requestedAmount, requestedDurationInMonths, new BigDecimal("4.00"));
			}
		} else if (criteria == ClientType.PRIORITY_CLIENT) {
			return new PriorityLoan(requestedAmount, requestedDurationInMonths);
		} else if (criteria == ClientType.OLD_CLIENT) {
			return new BankLoan(requestedAmount, requestedDurationInMonths, new BigDecimal("3.90"));
		}
		throw new IllegalArgumentException("Creation scenario not supported.");
	}
	
	public static void main(String[] args) {
		Loan l1 = LoanFactory.getLoanForClient(LoanFactory.ClientType.NEW_CLIENT, new BigDecimal("100"), 5);
		Loan l2 = LoanFactory.getLoanForClient(LoanFactory.ClientType.PRIORITY_CLIENT, new BigDecimal("10000"), 15);
		Loan l3 = LoanFactory.getLoanForClient(LoanFactory.ClientType.OLD_CLIENT, new BigDecimal("1100"), 15);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
