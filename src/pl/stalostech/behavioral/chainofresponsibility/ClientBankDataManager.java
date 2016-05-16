package pl.stalostech.behavioral.chainofresponsibility;

public class ClientBankDataManager extends AbstractClientManager {

	@Override
	protected void doWork() {
		System.out.println("Processing bank data of client.");
	}

}
