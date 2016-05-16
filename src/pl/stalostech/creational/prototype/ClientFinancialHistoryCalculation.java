package pl.stalostech.creational.prototype;

/**
 * Costly in creation object.
 * 
 * @author Bartosz Wysocki
 *
 */
public class ClientFinancialHistoryCalculation implements Prototype<ClientFinancialHistoryCalculation>{

	private int clientId;

	/**
	 * From 0 to 100
	 */
	private int pointsForFinancialHistory;

	private ClientFinancialHistoryCalculation() {}
	
	public ClientFinancialHistoryCalculation(int clientId) {
		try {
			Thread.sleep(3000); // here time consuming operations to get points
		} catch (InterruptedException e) {
			//do nothing
		}
		this.clientId = clientId;
		this.pointsForFinancialHistory = 45;
	}

	public int getPointsForFinancialHistory() {
		return pointsForFinancialHistory;
	}

	public int getClientId() {
		return clientId;
	}

	@Override
	public String toString() {
		return "ClientFinancialHistoryCalculation [clientId=" + clientId + ", pointsForFinancialHistory="
				+ pointsForFinancialHistory + "]";
	}

	/**
	 * In prod. code be prepared for deep coping.
	 */
	@Override
	public ClientFinancialHistoryCalculation getClone() {
		ClientFinancialHistoryCalculation clone = new ClientFinancialHistoryCalculation();
		clone.clientId = this.clientId;
		clone.pointsForFinancialHistory = this.pointsForFinancialHistory;
		return clone;
	}

}
