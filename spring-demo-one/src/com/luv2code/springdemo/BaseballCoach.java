package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//define the private field
	private FortuneService fortuneService;
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "spent 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		// use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
