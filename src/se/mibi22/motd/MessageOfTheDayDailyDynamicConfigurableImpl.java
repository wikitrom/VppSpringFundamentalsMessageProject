package se.mibi22.motd;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MessageOfTheDayDailyDynamicConfigurableImpl implements MessageOfTheDayService {

	private String[] messageList;

	public void setMessageList(String[] msgList) {
		messageList = msgList;
	}

	@Override
	public String getTodaysMessage() {
		int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);

		return messageList[day - 1];
	}

}
