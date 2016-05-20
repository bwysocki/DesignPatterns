package pl.stalostech.behavioral.strategy;

public class Context {

	private Installments installments;

	public Context(Installments installments) {
		this.installments = installments;
	}

	public void doStrategy() {
		installments.getInstallments();
	}

}
