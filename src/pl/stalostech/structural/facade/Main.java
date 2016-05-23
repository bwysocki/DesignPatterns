package pl.stalostech.structural.facade;

public class Main {

	public static void main(String[] args) {
		
		CheckClientFacade facade = new CheckClientFacade();
		facade.checkClient("123");
		
	}

}
