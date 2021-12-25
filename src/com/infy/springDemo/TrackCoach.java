package com.infy.springDemo;

public class TrackCoach implements Coach {
	private FortuneService services;
	
	TrackCoach(FortuneService fortuneService){
		this.services= fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return services.getFortune();
	}

}
