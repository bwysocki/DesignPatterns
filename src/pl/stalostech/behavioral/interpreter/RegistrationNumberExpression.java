package pl.stalostech.behavioral.interpreter;

/**
 * Gets information about birthday.
 * 
 * @author Bartosz Wysocki
 *
 */
public class RegistrationNumberExpression implements Expression {

	@Override
	public void interpret(Context context) {
		if (context.getClientNr() != null) {
			context.setOrderInaDay(Integer.valueOf(context.getClientNr().substring(8, 10)));
		}
	}

}
