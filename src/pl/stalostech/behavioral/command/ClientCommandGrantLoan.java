package pl.stalostech.behavioral.command;

/**
 * Changes client data
 * 
 * @author Bartosz Wysocki
 *
 */
public class ClientCommandGrantLoan implements ClientCommand {
	
	private ClientCommandRequest clientCommandRequest;

	public ClientCommandGrantLoan(ClientCommandRequest clientCommandRequest) {
		this.clientCommandRequest = clientCommandRequest;
	}
	
	@Override
	public void execute() {
		clientCommandRequest.giveLoan();
		clientCommandRequest.sendNotificationByEmail();
		clientCommandRequest.sendNotificationByPost();
	}

}
