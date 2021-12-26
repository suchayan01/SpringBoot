package com.infy.springDemo;

public class cricketCoach implements  Coach {
	private FortuneService fortuneService;
	
//	public cricketCoach() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Inside CricketCoach no-arg const");
//	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice 50 over match";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
