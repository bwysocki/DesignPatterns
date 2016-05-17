package pl.stalostech.behavioral.command;

/**
 * Changes client data
 * 
 * @author Bartosz Wysocki
 *
 */
public class ClientCommandChangeData implements ClientCommand {

	private ClientCommandRequest clientCommandRequest;

	public ClientCommandChangeData(ClientCommandRequest clientCommandRequest) {
		this.clientCommandRequest = clientCommandRequest;
	}

	@Override
	public void execute() {
		clientCommandRequest.changeData();
		clientCommandRequest.sendNotificationByEmail();
	}

}
