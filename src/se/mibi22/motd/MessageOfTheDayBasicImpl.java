package se.mibi22.motd;

public class MessageOfTheDayBasicImpl implements MessageOfTheDayService {

	private String message;
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	
	@Override
	public String getTodaysMessage() {
		return this.message;
	}

}
