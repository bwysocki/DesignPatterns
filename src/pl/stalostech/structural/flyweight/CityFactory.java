package pl.stalostech.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CityFactory {

	private static final Map<String, City> flyweight = new HashMap<>();
	
	public static City getCity(String name) {
		City city = flyweight.get(name);
		if (city == null) {
			city = new City(name, loadPopulationFromWS(), loadDistrictsFromWs());
			flyweight.put(name, city);
			System.out.println("Creating new city.");
		}
		return city;
	}
	
	private static int loadPopulationFromWS() {
		return 100000;
	}
	
	private static int loadDistrictsFromWs() {
		return 5;
	}
	
}
