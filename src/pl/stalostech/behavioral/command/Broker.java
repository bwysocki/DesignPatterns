package pl.stalostech.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Broker for processing commands
 * 
 * @author Bartosz Wysocki
 *
 */
public class Broker extends Thread {

	private List<ClientCommand> commands = new ArrayList<>();

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
