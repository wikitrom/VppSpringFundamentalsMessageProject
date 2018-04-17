package se.mibi22.motd;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MessageOfTheDayDailyDynamicImpl implements MessageOfTheDayService {

	private String[] messages = new String[]
			{
					"Sunday, go back to sleep",
					"Monday, slow start of work week ",
					"Tuesday ride is comming up",
					"Wednesday is small Saturday",
					"Thursday, panic... soon Friday",
					"Fredagsmys",
					"Bar walkabout!"
			};
			
	
	@Override
	public String getTodaysMessage() {
		int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
		
		return messages[day-1];
	}
}