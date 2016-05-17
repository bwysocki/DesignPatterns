package pl.stalostech.behavioral.interpreter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Gets information about birthday.
 * 
 * @author Bartosz Wysocki
 *
 */
public class DateOfBirthdayExpression implements Expression {

	@Override
	public void interpret(Context context) {
		if (context.getClientNr() != null) {
			String birthday = context.getClientNr().substring(0, 8);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate dateTime = LocalDate.parse(birthday, formatter);

			formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			context.setDateOfBirdthday(dateTime.format(formatter));
		}
	}

}
