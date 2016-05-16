package pl.stalostech.behavioral.chainofresponsibility;

public abstract class AbstractClientManager {

	protected AbstractClientManager nextManager;
	
	abstract protected void doWork();
	
	public void setNextManager(AbstractClientManager nextManager) {
		this.nextManager = nextManager;
	}
	
	public void processClient() {
		doWork();
		if (nextManager != null) {
			nextManager.processClient();
		}
	}
	
}
