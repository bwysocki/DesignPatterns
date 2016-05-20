package pl.stalostech.behavioral.strategy;

public class DailyInstallments implements Installments{

	@Override
	public void getInstallments() {
		System.out.println("Daily installments.");
	}

}
