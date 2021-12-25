package com.infy.springDemo;

public class BaseBallCoach implements Coach {
	private FortuneService hservices;
	public BaseBallCoach(FortuneService fortuneService) {
		this.hservices= fortuneService;
	}
	@Override
	public String getDailyFortune() {
		return hservices.getFortune();
	}
	@Override
	public String getDailyWorkout() {
		return "Go for a run for 30 mins";
		
	}

}
