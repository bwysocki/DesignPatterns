package pl.stalostech.behavioral.interpreter;

/**
 * Interface for concrete interpreters.
 * @author Bartosz Wysocki
 *
 */
public interface Expression {
	
	public void interpret(Context context);
	
}
