package pl.stalostech.behavioral.chainofresponsibility;

public class ChainOfResponsibilityClientManager {

	public AbstractClientManager getChainOfResponsibility() {

		AbstractClientManager clientPrivateDataManager = new ClientPrivateDataManager();
		AbstractClientManager clientBankDataManager = new ClientBankDataManager();

		clientPrivateDataManager.setNextManager(clientBankDataManager);

		return clientPrivateDataManager;
	}

}
