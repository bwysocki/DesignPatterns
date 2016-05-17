package pl.stalostech.behavioral.command;

/**
 * Request wrapped by command pattern
 * 
 * @author Bartosz Wysocki
 *
 */
public class ClientCommandRequest {

	public void changeData() {
		System.out.println("Client data changed.");
	}
	
	public void giveLoan() {
		System.out.println("Client received a loan.");
	}
	
	public void sendNotificationByEmail() {
		System.out.println("Notification by email sent.");
	}
	
	public void sendNotificationByPost() {
		System.out.println("Notification by post sent.");
	}
}
