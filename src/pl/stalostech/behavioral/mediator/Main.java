package pl.stalostech.behavioral.mediator;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Mediator clientMediator = new ClientMediator();

		Client c1 = new Client(clientMediator, new BigDecimal("1000"));
		Client c2 = new Client(clientMediator, new BigDecimal("3000"));
		Client c3 = new Client(clientMediator, new BigDecimal("2000"));
		
		c1.sendMoneyToClient(new BigDecimal("500"), c2);
		c1.sendMoneyToClient(new BigDecimal("100"), c3);
		c2.sendMoneyToClient(new BigDecimal("1500"), c3);
		c3.sendMoneyToClient(new BigDecimal("600"), c1);
		
		System.out.println(c1.getBalance());
		System.out.println(c2.getBalance());
		System.out.println(c3.getBalance());
	}

}
