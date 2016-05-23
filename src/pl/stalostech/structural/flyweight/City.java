package pl.stalostech.structural.flyweight;

public class City {

	private String name;
	
	private int population;
	
	private int districts;

	public City(String name, int population, int districts) {
		this.name = name;
		this.population = population;
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public int getDistricts() {
		return districts;
	}
	
}
