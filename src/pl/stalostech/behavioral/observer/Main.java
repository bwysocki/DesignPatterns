package pl.stalostech.behavioral.observer;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		BaseIntrest baseIntrest = new BaseIntrest();
		baseIntrest.setBaseIntrest(new BigDecimal("2.00"));
		
		PriorityLoan ploan = new PriorityLoan(baseIntrest);
		StandardLoan sloan = new StandardLoan(baseIntrest);
		WeeklyLoan wloan = new WeeklyLoan(baseIntrest);
		
		baseIntrest.setBaseIntrest(new BigDecimal("2.01"));
		
	}

}
