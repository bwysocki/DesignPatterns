package pl.stalostech.behavioral.interpreter;

/**
 * Context of grammar.
 * 
 * @author Bartosz Wysocki
 *
 */
public class Context {

	private String clientNr;

	private String dateOfBirdthday;

	private int orderInaDay;

	public Context(String clientNr) {
		this.clientNr = clientNr;
	}

	public String getClientNr() {
		return clientNr;
	}

	public void setClientNr(String clientNr) {
		this.clientNr = clientNr;
	}

	public String getDateOfBirdthday() {
		return dateOfBirdthday;
	}

	public void setDateOfBirdthday(String dateOfBirdthday) {
		this.dateOfBirdthday = dateOfBirdthday;
	}

	public int getOrderInaDay() {
		return orderInaDay;
	}

	public void setOrderInaDay(int orderInaDay) {
		this.orderInaDay = orderInaDay;
	}

}
