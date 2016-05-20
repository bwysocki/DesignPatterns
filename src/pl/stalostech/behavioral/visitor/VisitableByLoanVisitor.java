package pl.stalostech.behavioral.visitor;

public interface VisitableByLoanVisitor {

	public void accept(LoanVisitor visitor);

}
