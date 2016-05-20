package pl.stalostech.behavioral.strategy;

public class Main {

	public static void main(String[] args) {

		Context context = new Context(new DailyInstallments());
		context.doStrategy();
		
		context = new Context(new MonthlyInstallments());
		context.doStrategy();
		
		context = new Context(new WeeklyInstallments());
		context.doStrategy();
	}

}
