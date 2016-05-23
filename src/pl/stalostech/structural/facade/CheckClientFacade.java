package pl.stalostech.structural.facade;

public class CheckClientFacade {
	
	private ClientCreditHistory creditHistory;
	private ClientFamilyRelations familyRelations;
	private ClientWorkHistory workHistory;
	
	public CheckClientFacade() {
		creditHistory = new ClientCreditHistory();
		familyRelations = new ClientFamilyRelations();
		workHistory = new ClientWorkHistory();
	}
	
	public void checkClient(String clientId) {
		creditHistory.checkClientCreditHistory(clientId);
		familyRelations.checkClientFamilyRelations(clientId);
		workHistory.checkClientWorkHistory(clientId);
	}
	
}
