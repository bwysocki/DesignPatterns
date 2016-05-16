package pl.stalostech.creational.builder;

public class Main {

	public static void main(String[] args) {
		Client client = new Client.ClientBuilder("Mark", "Twain")
				.withCity("Szczecin")
				.withHomeOwnerInfo(false)
				.withEmployedInfo(true)
				.build();
		
		System.out.println(client);
	}

}
