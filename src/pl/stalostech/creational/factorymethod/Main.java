package pl.stalostech.creational.factorymethod;

public class Main {
	
	public static void main(String[] args) {
		
		ClientForeignLoanCounter foreignLoanCounter = new ClientForeignLoanCounter();
		System.out.println(foreignLoanCounter.countAllClientLoans());
		
	}
	
}
