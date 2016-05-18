package pl.stalostech.behavioral.observer;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class BaseIntrest {

	private BigDecimal baseIntrest;
	
	private Set<BaseIntrestObserver> observers = new HashSet<>();

	public BigDecimal getBaseIntrest() {
		return baseIntrest;
	}

	public void setBaseIntrest(BigDecimal baseIntrest) {
		this.baseIntrest = baseIntrest;
		this.notifyObservers();
	}
	
	public void addObserver(BaseIntrestObserver observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for (BaseIntrestObserver observer: observers) {
			observer.getEventFromObservable();
		}
	}

}
