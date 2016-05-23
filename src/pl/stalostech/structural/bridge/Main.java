package pl.stalostech.structural.bridge;

public class Main {

	public static void main(String[] args) {

		Loan priorityLoan = new PriorityLoan(new PaymentMonth());
		priorityLoan.makePayment(1254.52);
		
		priorityLoan = new PriorityLoan(new PaymentWeek());
		priorityLoan.makePayment(1254.52);
		
	}

}
