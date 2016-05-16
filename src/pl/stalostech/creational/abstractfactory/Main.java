package pl.stalostech.creational.abstractfactory;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		BankProductsAbstractFactory factory;
		BankProductsAbstractFactory.ClientType criteria = BankProductsAbstractFactory.ClientType.SHORT_TIME_CLIENT;
		
		if (criteria == BankProductsAbstractFactory.ClientType.PRIORITY_CLIENT) {
			factory = new PriorityProductsFactory();
		} else if (criteria == BankProductsAbstractFactory.ClientType.SHORT_TIME_CLIENT) {
			factory = new MonthProductsFactory();
		} else {
			throw new IllegalArgumentException("Wrong criteria");
		}
		
		System.out.println(factory.getAccount());
		System.out.println(factory.getLoan(new BigDecimal("15000"), 1));

	}

}
