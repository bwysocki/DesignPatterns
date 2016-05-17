package pl.stalostech.behavioral.command;

public class Main {

	public static void main(String[] args) {
		
		Broker broker = new Broker();
		broker.start();
		
		ClientCommandRequest request = new ClientCommandRequest();
		
		ClientCommandChangeData changeDataCommand = new ClientCommandChangeData(request);
		ClientCommandGrantLoan grantLoanCommand = new ClientCommandGrantLoan(request);
		
		try {
			Thread.sleep(1000);
			//add first command to broker
			broker.addCommand(grantLoanCommand);
			Thread.sleep(2000);
			//add second command to broker
			broker.addCommand(changeDataCommand);
			//stop broker
			Thread.sleep(500);
			broker.interrupt();
		} catch (InterruptedException e) {
			// do nothing
		}
		
	}

}
