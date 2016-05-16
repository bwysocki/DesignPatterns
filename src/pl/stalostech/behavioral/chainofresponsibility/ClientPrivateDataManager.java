package pl.stalostech.behavioral.chainofresponsibility;

public class ClientPrivateDataManager extends AbstractClientManager {

	@Override
	protected void doWork() {
		System.out.println("Processing private data of client.");
	}

}
