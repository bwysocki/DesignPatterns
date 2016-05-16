package pl.stalostech.creational.prototype;

public class Main {

	public static void main(String[] args) {

		System.out.println(ClientFinancialHistoryCalculationFactory.getInstance(124)); // slow
		System.out.println(ClientFinancialHistoryCalculationFactory.getInstance(124)); // fast

	}

}
