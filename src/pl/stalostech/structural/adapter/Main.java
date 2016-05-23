package pl.stalostech.structural.adapter;

public class Main {

	public static void main(String[] args) {

		CreditCard cc = new CreditCard();
		DebitCard dc = new DebitCard("12345");
		
		CardAdapter adapter = new CardAdapter(cc, dc);
		
		adapter.useCard("54631");
		adapter.useCard("12345");
	}

}
