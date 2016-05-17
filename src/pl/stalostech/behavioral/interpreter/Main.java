package pl.stalostech.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// client is constructed in a following format:
		// yyyy-mm-dd plus registration number in following day
		Context clientInfo = new Context("2013120142");

		List<Expression> expressions = Arrays.asList(new DateOfBirthdayExpression(),
				new RegistrationNumberExpression());

		expressions.forEach(expression -> expression.interpret(clientInfo));

		System.out.println(clientInfo.getDateOfBirdthday());
		System.out.println(clientInfo.getOrderInaDay());

	}

}
