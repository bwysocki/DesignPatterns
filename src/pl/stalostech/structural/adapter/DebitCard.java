package pl.stalostech.structural.adapter;

public class DebitCard {

	private String number;

	public DebitCard(String number) {
		this.number = number;
	}

	public void useDebitCard() {
		System.out.println("Using debit card.");
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
