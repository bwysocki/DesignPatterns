package pl.stalostech.structural.adapter;

public class CardAdapter {
	
	private CreditCard creditCard;
	private DebitCard debitCard;
	
	public CardAdapter(CreditCard creditCard, DebitCard debitCard) {
		this.creditCard = creditCard;
		this.debitCard = debitCard;
	}
	
	public void useCard(String number) {
		if (debitCard.getNumber().equals(number)) {
			debitCard.useDebitCard();
		} else {
			creditCard.useCreditCard(number);
		}
	}
	
}
