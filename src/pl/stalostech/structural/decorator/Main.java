package pl.stalostech.structural.decorator;

public class Main {

	public static void main(String[] args) {

		Loan ploan = new PriorityLoan();
		Loan sloan = new StandardLoan();
		
		System.out.println(ploan.getIntrest());
		System.out.println(sloan.getIntrest());
		
		Loan discountPriorityLoan = new ExtraDiscountLoanIntrestDecorator(ploan);
		System.out.println(discountPriorityLoan.getIntrest());
		
	}

}
