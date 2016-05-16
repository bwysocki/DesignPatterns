package pl.stalostech.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * To creation uses prototype design pattern.
 * @author Bartosz Wysocki
 *
 */
public class ClientFinancialHistoryCalculationFactory {
	
	private static Map<Integer, ClientFinancialHistoryCalculation> finHistoryPrototype = new HashMap<>();
	
	public static ClientFinancialHistoryCalculation getInstance(int clientId) {
		if (!finHistoryPrototype.containsKey(clientId)) {
			finHistoryPrototype.put(clientId, new ClientFinancialHistoryCalculation(clientId));
		}
		return finHistoryPrototype.get(clientId).getClone(); 
	}
	
}
