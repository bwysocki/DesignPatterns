package pl.stalostech.behavioral.visitor;

public class AverageLoanVisitor implements LoanVisitor {
	
	private int visited = 0;
	
	private double averageIntrest = 0;
	
	@Override
	public void visit(PriorityLoan ploan) {
		System.out.println("Visiting priority loan");
		visited = visited + 1;
		averageIntrest += ploan.getIntrests();
	}

	@Override
	public void visit(StandardLoan sloan) {
		System.out.println("Visiting standard loan");
		visited = visited + 1;
		averageIntrest += sloan.getIntrests() + sloan.getExtraNoAccountIntrest();
	}
	
	public double getAverageIntrest() {
		return averageIntrest / visited;
	}

}
