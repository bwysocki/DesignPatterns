package pl.stalostech.behavioral.visitor;

public interface LoanVisitor {
	
	public void visit(PriorityLoan ploan);
	
	public void visit(StandardLoan ploan);
	
}
