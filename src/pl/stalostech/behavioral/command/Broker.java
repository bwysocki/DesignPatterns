package pl.stalostech.behavioral.command;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Broker for processing commands
 * 
 * @author Bartosz Wysocki
 *
 */
public class Broker extends Thread {

	private List<ClientCommand> commands = new CopyOnWriteArrayList<>();

	public void addCommand(ClientCommand command) {
		commands.add(command);
	}

	@Override
	public void run() {
		while (true) {
			if (this.isInterrupted()) {
				return;
			}

			if (!commands.isEmpty()) { // take first and fire
				commands.remove(0).execute();
			}
		}
	}

}
