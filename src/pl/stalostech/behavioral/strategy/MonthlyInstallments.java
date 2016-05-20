package pl.stalostech.behavioral.strategy;

public class MonthlyInstallments implements Installments{

	@Override
	public void getInstallments() {
		System.out.println("Monthly installments.");
	}

}
