package pl.stalostech.behavioral.visitor;

public class Main {

	public static void main(String[] args) {

		VisitableByLoanVisitor ploan = new PriorityLoan();
		VisitableByLoanVisitor sloan = new StandardLoan();
		
		AverageLoanVisitor visitor = new AverageLoanVisitor();
		ploan.accept(visitor);
		sloan.accept(visitor);
		
		System.out.println(visitor.getAverageIntrest());
	}

}
