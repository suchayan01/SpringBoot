package com.infy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach coach = context.getBean("baseballcoaches", Coach.class);
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
	System.out.println("\n\n");
	coach = context.getBean("trackcoaches", Coach.class);
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
	context.close();
	}
}
