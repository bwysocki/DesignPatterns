package pl.stalostech.behavioral.visitor;

public class PriorityLoan implements VisitableByLoanVisitor {
	
	private double intrests = 3.53;
	
	@Override
	public void accept(LoanVisitor visitor) {
		visitor.visit(this);
	}

	public double getIntrests() {
		return intrests;
	}

	public void setIntrests(double intrests) {
		this.intrests = intrests;
	}

}
