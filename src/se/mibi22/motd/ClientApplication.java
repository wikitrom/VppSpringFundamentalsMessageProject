package se.mibi22.motd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

		MessageOfTheDayService mrBSaysHello = container.getBean("motdService", MessageOfTheDayBasicImpl.class);

		MessageOfTheDayService mrBSaysPing = container.getBean("motdServicePing", MessageOfTheDayBasicImpl.class);

		System.out.println(mrBSaysHello.getTodaysMessage());
		System.out.println(mrBSaysPing.getTodaysMessage());
		container.close();

	}

}
