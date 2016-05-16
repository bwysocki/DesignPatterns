package pl.stalostech.behavioral.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		
		ChainOfResponsibilityClientManager chain = new ChainOfResponsibilityClientManager();
		chain.getChainOfResponsibility().processClient();

	}

}
