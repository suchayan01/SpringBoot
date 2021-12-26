package com.infy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSetter {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach coach= context.getBean("cricketCoach",cricketCoach.class);
	System.out.println(coach.getDailyFortune());
	System.out.println(coach.getDailyWorkout());
	
	}

}
