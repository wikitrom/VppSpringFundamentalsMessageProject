package se.mibi22.motd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

		MessageOfTheDayService mrBSaysHello = container.getBean("motdService", MessageOfTheDayService.class);

		System.out.println(mrBSaysHello.getTodaysMessage());
		
		container.close();

	}

}
