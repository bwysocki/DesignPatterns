package pl.stalostech.behavioral.visitor;

public class StandardLoan implements VisitableByLoanVisitor {

	private double intrests = 4.43;
	
	private double extraNoAccountIntrest = 0.5;
	
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

	public double getExtraNoAccountIntrest() {
		return extraNoAccountIntrest;
	}

	public void setExtraNoAccountIntrest(double extraNoAccountIntrest) {
		this.extraNoAccountIntrest = extraNoAccountIntrest;
	}

}
