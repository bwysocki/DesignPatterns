package pl.stalostech.behavioral.strategy;

public class WeeklyInstallments implements Installments{

	@Override
	public void getInstallments() {
		System.out.println("Weekly installments.");
	}

}
