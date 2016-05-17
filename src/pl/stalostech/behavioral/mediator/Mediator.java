package pl.stalostech.behavioral.mediator;

import java.math.BigDecimal;

public interface Mediator {

	public BigDecimal sendMoneyToClient(BigDecimal amount, Client client);
	
}
