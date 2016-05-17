package pl.stalostech.behavioral.mediator;

import java.math.BigDecimal;

public class ClientMediator implements Mediator{

	@Override
	public BigDecimal sendMoneyToClient(BigDecimal amount, Client client) {
		client.setBalance(client.getBalance().add(amount));
		return amount;
	}

}
