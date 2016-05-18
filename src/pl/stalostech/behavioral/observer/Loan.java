package pl.stalostech.behavioral.observer;

import java.math.BigDecimal;

public abstract class Loan extends BaseIntrestObserver {

	protected BigDecimal intrest;

	protected BaseIntrest baseIntrest;

	public Loan(BaseIntrest baseIntrest) {
		this.baseIntrest = baseIntrest;
		setBaseIntrest();
		this.baseIntrest.addObserver(this);
	}

	protected abstract double getLoanIntrest();

	protected abstract String getChangeMsg();

	@Override
	protected void getEventFromObservable() {
		setBaseIntrest();
		System.out.println(getChangeMsg());
	}

	public BigDecimal getIntrest() {
		return intrest;
	}

	private void setBaseIntrest() {
		this.intrest = this.baseIntrest.getBaseIntrest().add(new BigDecimal(getLoanIntrest()));
	}

}
