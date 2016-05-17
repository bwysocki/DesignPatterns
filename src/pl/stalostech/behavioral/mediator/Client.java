package pl.stalostech.behavioral.mediator;

import java.math.BigDecimal;

public class Client {

	private Mediator mediator;
	private BigDecimal balance;

	public Client(Mediator mediator, BigDecimal startBalance) {
		this.mediator = mediator;
		this.balance = startBalance;
	}
	
	public void sendMoneyToClient(BigDecimal amount, Client client) {
		balance = balance.subtract(this.mediator.sendMoneyToClient(amount, client)); // missing check if < 0
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
}
